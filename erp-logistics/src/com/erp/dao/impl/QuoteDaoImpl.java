/*
 * @(#)QuoteDaoImpl.java 2015-4-4 ����02:29:05
 * erp-manufacture
 */
package com.erp.dao.impl;

import org.springframework.stereotype.Component;

import com.erp.dao.QuoteDao;
import com.erp.model.Quote;

/**
 * QuoteDaoImpl
 * @author wang
 * @version 1.0
 *
 */
@Component("quoteDao")
public class QuoteDaoImpl extends BaseDaoImpl<Quote> implements QuoteDao {

}
