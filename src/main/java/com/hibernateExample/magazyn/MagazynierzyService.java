package com.hibernateExample.magazyn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagazynierzyService {
    private MagazynierzyRepo magazynierzyRepo;

      @Autowired
         public MagazynierzyService(MagazynierzyRepo magazynierzyRepo) {
        this.magazynierzyRepo = magazynierzyRepo;
    }
}
