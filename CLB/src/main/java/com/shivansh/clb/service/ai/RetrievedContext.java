package com.shivansh.clb.service.ai;

import com.shivansh.clb.dto.CitationDto;

import java.util.List;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}