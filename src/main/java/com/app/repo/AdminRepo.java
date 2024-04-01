package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import com.app.entity.Admin;

public interface AdminRepo extends CrudRepository<Admin, String> {
    // You can add custom query methods here if needed
}
