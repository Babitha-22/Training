package my.advertiser.core.services;

import my.advertiser.core.daos.AdvertiserDao;
import my.advertiser.core.model.AdvertiserModel;

import java.util.List;

public class DefaultAdvertiserService implements AdvertiserServices{
    private final AdvertiserDao advertiserDao;

    public DefaultAdvertiserService(final AdvertiserDao advertiserDao) {
        super();
        this.advertiserDao = advertiserDao;
    }

    @Override
    public List<AdvertiserModel> getAllAdvertisers() {
        return advertiserDao.getAllAdvertisers();
    }

    @Override
    public AdvertiserModel getAdvertiserByCode(String advertiserCode) {
        return advertiserDao.getAdvertiserByCode(advertiserCode);
    }
}
