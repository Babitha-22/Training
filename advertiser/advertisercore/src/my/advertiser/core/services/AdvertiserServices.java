package my.advertiser.core.services;

import my.advertiser.core.model.AdvertiserModel;

import java.util.List;

public interface AdvertiserServices {
    List<AdvertiserModel> getAllAdvertisers();
    AdvertiserModel getAdvertiserByCode(String advertiserCode);
}
