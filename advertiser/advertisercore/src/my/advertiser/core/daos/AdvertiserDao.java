package my.advertiser.core.daos;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import my.advertiser.core.jalo.Advertiser;
import my.advertiser.core.model.AdvertiserModel;

import java.util.List;

public interface AdvertiserDao extends Dao {
    List<AdvertiserModel> getAllAdvertisers();
    AdvertiserModel getAdvertiserByCode(String advertiserCode);
}
