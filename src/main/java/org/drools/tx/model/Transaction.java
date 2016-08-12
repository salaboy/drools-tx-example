/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.tx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {

    private String clientId;
    private String tillTransactionId;
    private Date tillTimestamp;
    private String currency;
    private Double basketTotal;
    private Basket basket;
    private List<Label> labels;

    public Transaction() {
    }

    public Transaction( String clientId, String tillTransactionId, Date tillTimestamp, String currency, Double basketTotal, Basket basket ) {
        this.clientId = clientId;
        this.tillTransactionId = tillTransactionId;
        this.tillTimestamp = tillTimestamp;
        this.currency = currency;
        this.basketTotal = basketTotal;
        this.basket = basket;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId( String clientId ) {
        this.clientId = clientId;
    }

    public String getTillTransactionId() {
        return tillTransactionId;
    }

    public void setTillTransactionId( String tillTransactionId ) {
        this.tillTransactionId = tillTransactionId;
    }

    public Date getTillTimestamp() {
        return tillTimestamp;
    }

    public void setTillTimestamp( Date tillTimestamp ) {
        this.tillTimestamp = tillTimestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency( String currency ) {
        this.currency = currency;
    }

    public Double getBasketTotal() {
        return basketTotal;
    }

    public void setBasketTotal( Double basketTotal ) {
        this.basketTotal = basketTotal;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket( Basket basket ) {
        this.basket = basket;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels( List<Label> labels ) {
        this.labels = labels;
    }

    public void addLabel( String label ) {
        if ( this.labels == null ) {
            this.labels = new ArrayList<>();
        }
        this.labels.add( new Label( label ) );
    }
}