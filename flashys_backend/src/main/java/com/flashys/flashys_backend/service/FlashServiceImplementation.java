package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.repository.FlashRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FlashServiceImplementation implements FlashService {
    @Autowired
    private FlashRepository flashRepository;

    @Override
    public Flash createFlash(Flash flash) {
        return flashRepository.save(flash);
    }

    @Override
    public Flash getFlashById(String flashId) {
        return flashRepository.findById(flashId).orElse(null);
    }

    @Override
    public List<Flash> getAllFlashes() {
        return flashRepository.findAll();
    }

    @Override
    public void deleteFlash(String flashId) {
        flashRepository.deleteById(flashId);
    }

    public void deleteAllFlash() {
        flashRepository.deleteAll();
    }
}
