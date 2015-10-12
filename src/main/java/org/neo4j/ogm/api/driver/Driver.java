package org.neo4j.ogm.api.driver;

import org.neo4j.ogm.api.request.Request;
import org.neo4j.ogm.api.service.LoadableService;
import org.neo4j.ogm.api.transaction.Transaction;
import org.neo4j.ogm.api.transaction.TransactionManager;
import org.neo4j.ogm.config.ComponentConfiguration;

/**
 * @author vince
 */
public interface Driver extends LoadableService {

    public void configure(ComponentConfiguration config);
    public Object getConfig(String key);
    public Transaction newTransaction();
    public void close();
    public Request requestHandler();
    public void setTransactionManager(TransactionManager tx);


}