package my.advertiser.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import my.advertiser.core.model.AdvertiserModel;
import my.advertiser.facades.data.AdvertiserData;

public class AdvertiserPopulator implements Populator<AdvertiserModel, AdvertiserData> {
    @Override
    public void populate(final AdvertiserModel source, final AdvertiserData target) throws ConversionException {
        target.setAdvertiserCode(source.getAdvertiserCode());
        target.setAdvertiser(source.getAdvertiser());
        target.setClicks(source.getClicks());
        target.setImpressions(source.getImpressions());
        target.setCost(source.getCost());
    }
}
