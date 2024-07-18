package com.rindu.testcase3.dto.request;

import lombok.Data;

@Data
public class EmployeeRequestDTO {
    private String name;
    private String position;
    private Double salary;
}