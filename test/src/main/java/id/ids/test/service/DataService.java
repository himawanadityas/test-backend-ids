package id.ids.test.service;

import id.ids.test.dto.DataDTO;
import id.ids.test.dto.StatusDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DataService {
    List<DataDTO> getListData(Pageable page);

}
