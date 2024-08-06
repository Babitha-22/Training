package my.advertiser.facades.impl;

import my.advertiser.facades.data.AdvertiserData;

import java.util.List;

public interface AdvertiserFacade {
    List<AdvertiserData> getAllAdvertisers();
    AdvertiserData getAdvertiserByCode(String advertiserCode);
}
