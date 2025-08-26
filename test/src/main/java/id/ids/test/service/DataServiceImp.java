package id.ids.test.service;

import id.ids.test.dto.DataDTO;
import id.ids.test.entity.DataEntity;
import id.ids.test.repository.DataRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DataServiceImp implements DataService {

    private final DataRepository dataRepository;

    public DataServiceImp(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<DataDTO> getListData(Pageable page) {
        return dataRepository.findAll(page)
                .stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .toList();
    }



    private DataDTO mapToDto(DataEntity entity) {
        DataDTO dataDTO = new DataDTO();
        BeanUtils.copyProperties(entity, dataDTO);
        dataDTO.setStatus(entity.getStatus().getId());
        return dataDTO;
    }
}
