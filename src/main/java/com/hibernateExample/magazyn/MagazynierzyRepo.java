package com.hibernateExample.magazyn;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;


@Repository
       public interface MagazynierzyRepo extends CrudRepository<Magazynierzy, Integer> {

   /* @Override
    Iterable<Magazynierzy> findAll();*/
//   List<Magazynierzy> findById(Id idk);


}


