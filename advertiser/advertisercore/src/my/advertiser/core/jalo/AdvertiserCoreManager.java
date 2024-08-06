/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.advertiser.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.advertiser.core.constants.AdvertiserCoreConstants;
import my.advertiser.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class AdvertiserCoreManager extends GeneratedAdvertiserCoreManager
{
	public static final AdvertiserCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AdvertiserCoreManager) em.getExtension(AdvertiserCoreConstants.EXTENSIONNAME);
	}
}
