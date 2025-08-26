package id.ids.test.service;

import id.ids.test.dto.StatusDTO;
import id.ids.test.entity.StatusEntity;
import id.ids.test.repository.StatusRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StatusServiceImp implements StatusService {

    private final StatusRepository statusRepository;

    public StatusServiceImp(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public List<StatusDTO> getAllStatus(){
        return statusRepository.findAll().stream().filter(Objects::nonNull).map(this::mapToStatusDto).toList();
    }

    private StatusDTO mapToStatusDto(StatusEntity entity) {
        StatusDTO dto = new StatusDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
