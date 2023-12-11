package com.netflix.videostreaming.api;

import com.netflix.videostreaming.dto.ApiResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/video")
public interface VideoApi {

    @GetMapping("/getVideo")
    ApiResponseDTO getVideo();

}
