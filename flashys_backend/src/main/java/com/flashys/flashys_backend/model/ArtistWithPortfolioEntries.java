package com.flashys.flashys_backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ArtistWithPortfolioEntries {
    private Artist artist;
    private List<PortfolioEntry> recentPortfolioEntries;
}
