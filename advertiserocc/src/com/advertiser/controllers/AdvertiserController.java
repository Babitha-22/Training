package com.advertiser.controllers;

import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import my.advertiser.facades.data.AdvertiserData;
import my.advertiser.facades.data.AdvertiserListData;
import my.advertiser.facades.data.AdvertiserListWsDTO;
import my.advertiser.facades.data.AdvertiserWsDTO;
import my.advertiser.facades.impl.AdvertiserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Controller
@Api(tags = "Advertisers")
@RequestMapping(value = "/{baseSiteId}")
public class AdvertiserController {


        protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;

        @Resource(name = "advertiserFacade")
        AdvertiserFacade advertiserfacade;

        @Resource(name = "dataMapper")
        DataMapper dataMapper;

        /**
         * @return the advertiserFacade
         */
        public AdvertiserFacade getAdvertiserFacade()
        {

            return advertiserfacade;
        }


        public void setAdvertiserFacade(final AdvertiserFacade advertiserfacade)
        {
            this.advertiserfacade = advertiserfacade;
        }

        /**
         * @return the dataMapper
         */
        public DataMapper getDataMapper()
        {
            return dataMapper;
        }

        /**
         * @param dataMapper
         *           the dataMapper to set
         */
        public void setDataMapper(final DataMapper dataMapper)
        {
            this.dataMapper = dataMapper;
        }

        @RequestMapping(value = "/advertisers", method = RequestMethod.GET)
        @ResponseBody
        @ApiOperation(value = "getAllAdvertisers", nickname = "getAllAdvertisers", notes = "get All Advertisers")
        @ApiBaseSiteIdParam
        public AdvertiserListWsDTO getAllAdvertisers(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
        {
            final AdvertiserListData ald = new AdvertiserListData();
            final List<AdvertiserData> allAdvertisersData = advertiserfacade.getAllAdvertisers();
            ald.setAdvertisers(allAdvertisersData);
            return getDataMapper().map(ald, AdvertiserListWsDTO.class, fields);
        }

        @RequestMapping(value = "/advertiser/{advertiserCode}", method = RequestMethod.GET)
        @ResponseBody
        @ApiOperation(value = "getAdvertiserByCode", nickname = "getAdvertiserByCode", notes = "get Advertiser By Code")
        @ApiBaseSiteIdParam
        public AdvertiserWsDTO getAdvertiserByCode(
                @ApiParam(value = "Advertiser Code", required = true) @PathVariable final String advertiserCode,
                @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
        {
            final AdvertiserData advertiser = advertiserfacade.getAdvertiserByCode(advertiserCode);
            return getDataMapper().map(advertiser, AdvertiserWsDTO.class, fields);
        }
}
