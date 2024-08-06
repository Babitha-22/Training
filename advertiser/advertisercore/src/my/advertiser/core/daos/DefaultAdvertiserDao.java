package my.advertiser.core.daos;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import my.advertiser.core.model.AdvertiserModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultAdvertiserDao extends AbstractItemDao implements AdvertiserDao {
    @Autowired
    DefaultGenericDao<AdvertiserModel> advertiserDao;
    public DefaultAdvertiserDao(final DefaultGenericDao<AdvertiserModel> advertiserDao){
        super();
        this.advertiserDao=advertiserDao;
    }
    @Override
    public List<AdvertiserModel> getAllAdvertisers() {
        return advertiserDao.find();
    }

    @Override
    public AdvertiserModel getAdvertiserByCode(String advertiserCode) {
        final Map<String,String> params=new HashMap<>();
        params.put(AdvertiserModel.ADVERTISERCODE,advertiserCode);
        final List<AdvertiserModel> ad=advertiserDao.find(params);
        return ad.get(0);
    }
}
