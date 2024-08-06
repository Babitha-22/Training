/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.advertiser.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.advertiser.fulfilmentprocess.constants.AdvertiserFulfilmentProcessConstants;

public class AdvertiserFulfilmentProcessManager extends GeneratedAdvertiserFulfilmentProcessManager
{
	public static final AdvertiserFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AdvertiserFulfilmentProcessManager) em.getExtension(AdvertiserFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
