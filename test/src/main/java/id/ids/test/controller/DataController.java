package id.ids.test.controller;


import id.ids.test.dto.DataDTO;
import id.ids.test.dto.StatusDTO;
import id.ids.test.dto.SuccessResponseAPI;
import id.ids.test.service.DataService;
import id.ids.test.service.StatusService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/data")
public class DataController {

    private final DataService dataService;
    private final StatusService statusService;

    public DataController(DataService dataService, StatusService statusService) {
        this.dataService = dataService;
        this.statusService = statusService;
    }

    @GetMapping("/all")
    public ResponseEntity<SuccessResponseAPI<?>> getListData(@RequestParam(name = "page", defaultValue = "0") int page,
                                         @RequestParam(name = "size", defaultValue = "50") int size) {
        // penggunaan find all tidak direkomendasikan karena akan load seluruh data yang ada di data source,
        // disarankan menggunakan pageable agar query data lebih optimal

        List<DataDTO> data = dataService.getListData(PageRequest.of(page, size));

        // Status sebenarnya sama juga seperti yang di atas, tetapi untuk case ini tidak menggunakan pageable
        List<StatusDTO> status = statusService.getAllStatus();
        return new ResponseEntity<>(new SuccessResponseAPI<>(
                data,
                status
        ), HttpStatus.OK);
    }
}
