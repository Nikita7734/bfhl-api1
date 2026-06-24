package com.nikita.bfhl.service;

import com.nikita.bfhl.dto.BFHLRequest;
import com.nikita.bfhl.dto.BFHLResponse;

public interface BFHLService {

    BFHLResponse process(BFHLRequest request);
}