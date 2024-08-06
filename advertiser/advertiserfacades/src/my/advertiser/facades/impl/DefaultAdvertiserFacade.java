package my.advertiser.facades.impl;

import my.advertiser.core.model.AdvertiserModel;
import my.advertiser.core.services.AdvertiserServices;
import my.advertiser.facades.data.AdvertiserData;
import org.springframework.beans.factory.annotation.Autowired;
import de.hybris.platform.servicelayer.dto.converter.Converter;


import java.util.List;

public class DefaultAdvertiserFacade implements AdvertiserFacade {
    @Autowired
    AdvertiserServices advertiserService;

    @Autowired
    Converter<AdvertiserModel,AdvertiserData> advertiserConverter;

    @Override
    public List<AdvertiserData> getAllAdvertisers() {
        final List<AdvertiserModel> allAdvertiserModel=advertiserService.getAllAdvertisers();
        return advertiserConverter.convertAll(allAdvertiserModel);
    }

    @Override
    public AdvertiserData getAdvertiserByCode(String advertiserCode) {
        final AdvertiserModel ads=advertiserService.getAdvertiserByCode(advertiserCode);
        return advertiserConverter.convert(ads);
    }
}
