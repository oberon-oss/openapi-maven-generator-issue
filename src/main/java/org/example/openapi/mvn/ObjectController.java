package org.example.openapi.mvn;

import org.example.openapi.mvn.generated.api.ObjectsApi;
import org.example.openapi.mvn.generated.dto.GetAllObjects200ResponseInner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ObjectController implements ObjectsApi {
    @Override
    public ResponseEntity<List<GetAllObjects200ResponseInner>> getAllObjects() {
        return null;
    }

    @Override
    public ResponseEntity<GetAllObjects200ResponseInner> getObject() {
        return null;
    }

    @Override
    public ResponseEntity<GetAllObjects200ResponseInner> postObject(GetAllObjects200ResponseInner getAllObjects200ResponseInner) {
        return null;
    }
}
