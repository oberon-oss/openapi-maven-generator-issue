package org.example.openapi.mvn;

import org.example.openapi.mvn.generated.api.ObjectApi;
import org.example.openapi.mvn.generated.api.ObjectsApi;
import org.example.openapi.mvn.generated.dto.GetObject200Response;
import org.example.openapi.mvn.generated.dto.ObjectsGet200ResponseInner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class ObjectController implements ObjectsApi, ObjectApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ObjectsApi.super.getRequest();
    }

    @Override
    public ResponseEntity<List<ObjectsGet200ResponseInner>> objectsGet() {
        return ObjectsApi.super.objectsGet();
    }

    @Override
    public ResponseEntity<GetObject200Response> getObject() {
        return ObjectApi.super.getObject();
    }

    @Override
    public ResponseEntity<GetObject200Response> postObject(GetObject200Response getObject200Response) {
        return ObjectApi.super.postObject(getObject200Response);
    }
}
