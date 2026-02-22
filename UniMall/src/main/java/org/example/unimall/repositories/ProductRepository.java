package org.example.unimall.repositories;

import org.example.unimall.model.Category;
import org.example.unimall.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByCategory(Category category);

    List<Product> findAllByCategory(Category category);

    @Query(value = "select * from Product where price>50000",nativeQuery = true)
    Product getbyprice();

    @Query("select p from Product p where p.price between :start and :end")
    List<Product> getByPriceRange(@Param("start") int start ,
                                  @Param("end") int end);




}
