package com.fkadu.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Record(
        String CustomerNam,
        String ProductNam,
        int productID
) {}
