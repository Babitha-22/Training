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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.advertiser.core.constants.AdvertiserCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Advertiser}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAdvertiser extends GenericItem
{
	/** Qualifier of the <code>Advertiser.advertiserCode</code> attribute **/
	public static final String ADVERTISERCODE = "advertiserCode";
	/** Qualifier of the <code>Advertiser.advertiser</code> attribute **/
	public static final String ADVERTISER = "advertiser";
	/** Qualifier of the <code>Advertiser.clicks</code> attribute **/
	public static final String CLICKS = "clicks";
	/** Qualifier of the <code>Advertiser.impressions</code> attribute **/
	public static final String IMPRESSIONS = "impressions";
	/** Qualifier of the <code>Advertiser.cost</code> attribute **/
	public static final String COST = "cost";
	/** Qualifier of the <code>Advertiser.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for Advertiser2Product from ((advertisercore))*/
	protected static String ADVERTISER2PRODUCT_SRC_ORDERED = "relation.Advertiser2Product.source.ordered";
	protected static String ADVERTISER2PRODUCT_TGT_ORDERED = "relation.Advertiser2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Advertiser2Product from ((advertisercore))*/
	protected static String ADVERTISER2PRODUCT_MARKMODIFIED = "relation.Advertiser2Product.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ADVERTISERCODE, AttributeMode.INITIAL);
		tmp.put(ADVERTISER, AttributeMode.INITIAL);
		tmp.put(CLICKS, AttributeMode.INITIAL);
		tmp.put(IMPRESSIONS, AttributeMode.INITIAL);
		tmp.put(COST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.advertiser</code> attribute.
	 * @return the advertiser
	 */
	public String getAdvertiser(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADVERTISER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.advertiser</code> attribute.
	 * @return the advertiser
	 */
	public String getAdvertiser()
	{
		return getAdvertiser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.advertiser</code> attribute. 
	 * @param value the advertiser
	 */
	public void setAdvertiser(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADVERTISER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.advertiser</code> attribute. 
	 * @param value the advertiser
	 */
	public void setAdvertiser(final String value)
	{
		setAdvertiser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.advertiserCode</code> attribute.
	 * @return the advertiserCode
	 */
	public String getAdvertiserCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADVERTISERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.advertiserCode</code> attribute.
	 * @return the advertiserCode
	 */
	public String getAdvertiserCode()
	{
		return getAdvertiserCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.advertiserCode</code> attribute. 
	 * @param value the advertiserCode
	 */
	public void setAdvertiserCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADVERTISERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.advertiserCode</code> attribute. 
	 * @param value the advertiserCode
	 */
	public void setAdvertiserCode(final String value)
	{
		setAdvertiserCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.clicks</code> attribute.
	 * @return the clicks
	 */
	public Long getClicks(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CLICKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.clicks</code> attribute.
	 * @return the clicks
	 */
	public Long getClicks()
	{
		return getClicks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.clicks</code> attribute. 
	 * @return the clicks
	 */
	public long getClicksAsPrimitive(final SessionContext ctx)
	{
		Long value = getClicks( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.clicks</code> attribute. 
	 * @return the clicks
	 */
	public long getClicksAsPrimitive()
	{
		return getClicksAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.clicks</code> attribute. 
	 * @param value the clicks
	 */
	public void setClicks(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CLICKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.clicks</code> attribute. 
	 * @param value the clicks
	 */
	public void setClicks(final Long value)
	{
		setClicks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.clicks</code> attribute. 
	 * @param value the clicks
	 */
	public void setClicks(final SessionContext ctx, final long value)
	{
		setClicks( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.clicks</code> attribute. 
	 * @param value the clicks
	 */
	public void setClicks(final long value)
	{
		setClicks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.cost</code> attribute.
	 * @return the cost
	 */
	public Long getCost(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, COST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.cost</code> attribute.
	 * @return the cost
	 */
	public Long getCost()
	{
		return getCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.cost</code> attribute. 
	 * @return the cost
	 */
	public long getCostAsPrimitive(final SessionContext ctx)
	{
		Long value = getCost( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.cost</code> attribute. 
	 * @return the cost
	 */
	public long getCostAsPrimitive()
	{
		return getCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, COST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final Long value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final long value)
	{
		setCost( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final long value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.impressions</code> attribute.
	 * @return the impressions
	 */
	public Long getImpressions(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, IMPRESSIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.impressions</code> attribute.
	 * @return the impressions
	 */
	public Long getImpressions()
	{
		return getImpressions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.impressions</code> attribute. 
	 * @return the impressions
	 */
	public long getImpressionsAsPrimitive(final SessionContext ctx)
	{
		Long value = getImpressions( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.impressions</code> attribute. 
	 * @return the impressions
	 */
	public long getImpressionsAsPrimitive()
	{
		return getImpressionsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.impressions</code> attribute. 
	 * @param value the impressions
	 */
	public void setImpressions(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, IMPRESSIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.impressions</code> attribute. 
	 * @param value the impressions
	 */
	public void setImpressions(final Long value)
	{
		setImpressions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.impressions</code> attribute. 
	 * @param value the impressions
	 */
	public void setImpressions(final SessionContext ctx, final long value)
	{
		setImpressions( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.impressions</code> attribute. 
	 * @param value the impressions
	 */
	public void setImpressions(final long value)
	{
		setImpressions( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			true,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Advertiser.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			"Product",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Advertiser.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			true,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AdvertiserCoreConstants.Relations.ADVERTISER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ADVERTISER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
}
