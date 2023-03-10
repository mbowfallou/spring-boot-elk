package com.groupeisi.dao;

import com.groupeisi.entity.AppRolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {
    AppRolesEntity findByNom(String nom);
}
