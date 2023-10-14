package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.repository.FlashRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FlashService {

    Flash createFlash(Flash flash);
    Flash getFlashById(String flashId);
    List<Flash> getAllFlashs();
    void deleteFlash(String flashId);
}
