/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 17, 2024, 10:32:13 AM                   ---
 * ----------------------------------------------------------------
 */
package my.advertiser.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.advertiser.core.constants.AdvertiserCoreConstants;
import my.advertiser.core.jalo.Advertiser;
import my.advertiser.core.jalo.ApparelProduct;
import my.advertiser.core.jalo.ApparelSizeVariantProduct;
import my.advertiser.core.jalo.ApparelStyleVariantProduct;
import my.advertiser.core.jalo.ElectronicsColorVariantProduct;

/**
 * Generated class for type <code>AdvertiserCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAdvertiserCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Advertiser2Product from ((advertisercore))*/
	protected static String ADVERTISER2PRODUCT_SRC_ORDERED = "relation.Advertiser2Product.source.ordered";
	protected static String ADVERTISER2PRODUCT_TGT_ORDERED = "relation.Advertiser2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Advertiser2Product from ((advertisercore))*/
	protected static String ADVERTISER2PRODUCT_MARKMODIFIED = "relation.Advertiser2Product.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.advertisers</code> attribute.
	 * @return the advertisers
	 */
	public Collection<Advertiser> getAdvertisers(final SessionContext ctx, final Product item)
	{
		final List<Advertiser> items = item.getLinkedItems( 
			ctx,
			false,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			"Advertiser",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.advertisers</code> attribute.
	 * @return the advertisers
	 */
	public Collection<Advertiser> getAdvertisers(final Product item)
	{
		return getAdvertisers( getSession().getSessionContext(), item );
	}
	
	public long getAdvertisersCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			"Advertiser",
			null
		);
	}
	
	public long getAdvertisersCount(final Product item)
	{
		return getAdvertisersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.advertisers</code> attribute. 
	 * @param value the advertisers
	 */
	public void setAdvertisers(final SessionContext ctx, final Product item, final Collection<Advertiser> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.advertisers</code> attribute. 
	 * @param value the advertisers
	 */
	public void setAdvertisers(final Product item, final Collection<Advertiser> value)
	{
		setAdvertisers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advertisers. 
	 * @param value the item to add to advertisers
	 */
	public void addToAdvertisers(final SessionContext ctx, final Product item, final Advertiser value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advertisers. 
	 * @param value the item to add to advertisers
	 */
	public void addToAdvertisers(final Product item, final Advertiser value)
	{
		addToAdvertisers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advertisers. 
	 * @param value the item to remove from advertisers
	 */
	public void removeFromAdvertisers(final SessionContext ctx, final Product item, final Advertiser value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advertisers. 
	 * @param value the item to remove from advertisers
	 */
	public void removeFromAdvertisers(final Product item, final Advertiser value)
	{
		removeFromAdvertisers( getSession().getSessionContext(), item, value );
	}
	
	public Advertiser createAdvertiser(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AdvertiserCoreConstants.TC.ADVERTISER );
			return (Advertiser)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Advertiser : "+e.getMessage(), 0 );
		}
	}
	
	public Advertiser createAdvertiser(final Map attributeValues)
	{
		return createAdvertiser( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AdvertiserCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AdvertiserCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AdvertiserCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AdvertiserCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return AdvertiserCoreConstants.EXTENSIONNAME;
	}
	
}
