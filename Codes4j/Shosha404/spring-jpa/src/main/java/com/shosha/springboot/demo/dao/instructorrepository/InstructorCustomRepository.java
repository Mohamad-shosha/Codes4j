package com.shosha.springboot.demo.dao.instructorrepository;

import com.shosha.springboot.demo.model.entity.Address;

public interface InstructorCustomRepository {
    String getIdByEmail(String email);

    String getCourseCodeByEmail(String email);
}
