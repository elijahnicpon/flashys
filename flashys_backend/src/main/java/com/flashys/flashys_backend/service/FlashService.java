package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Flash;

import java.util.List;

public interface FlashService {
    Flash createFlash(Flash flash);
    Flash getFlashById(String flashId);
    List<Flash> getAllFlashes();
    void deleteFlash(String flashId);
}
