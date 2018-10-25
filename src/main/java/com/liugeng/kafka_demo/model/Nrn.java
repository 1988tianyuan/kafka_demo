package com.liugeng.kafka_demo.model;

import java.util.Objects;

/**
 * Nrn
 *
 */
public class Nrn {

    private static final String NRN_PREFIX = "nrn";
    private static final String SEPARATOR = ":";

    /** */
    private String nrn ;
    /** */
    private String product ;
    /** */
    private String region ;
    /** */
    private String account ;
    /** */
    private String resource ;


    public Nrn() {
    }

    public Nrn(String nrn) {
        this.nrn = nrn;
    }

    public Nrn(String product, String region, String account, String resource) {
        this.product = product;
        this.region = region;
        this.account = account;
        this.resource = resource;

        this.nrn = constructNrn();
    }

    public String constructNrn() {
        return NRN_PREFIX + SEPARATOR + checkEmptyStr(this.product)
                + SEPARATOR + checkEmptyStr(this.region)
                + SEPARATOR + checkEmptyStr(this.account)
                + SEPARATOR + checkEmptyStr(this.resource);
    }

    public static String constructNrn(String product, String region, String account, String resource) {
        return NRN_PREFIX + SEPARATOR + checkEmptyStr(product)
                + SEPARATOR + checkEmptyStr(region)
                + SEPARATOR + checkEmptyStr(account)
                + SEPARATOR + checkEmptyStr(resource);
    }

    public boolean deConstructNrn(String nrn) {
        if ( nrn == null || nrn.length() < 5 || !nrn.startsWith("nrn") )
            return false;

        String[] nrnSplit = nrn.split(SEPARATOR);

        if ( nrnSplit.length < 5 )
            return false;

        // nrnSplit[0]; // nrn. skip
        this.product = nrnSplit[1];
        this.region = nrnSplit[2];
        this.account = nrnSplit[3];
        this.resource = nrnSplit[4];

        // if resource have ':' restore them
        if ( nrnSplit.length > 5 ) {
            for (int i = 5 ; i < nrnSplit.length ; i++) {
                this.resource = this.resource.concat(":").concat(nrnSplit[i]);
            }
        }

        this.nrn = constructNrn();

        return true;
    }

    private static String checkEmptyStr(final String cs) {
        if (cs == null)
            return "";
        if (cs.trim().length() == 0)
            return "";
        return cs.trim();
    }

    public String getNrn() {
        return nrn;
    }

    public void setNrn(String nrn) {
        this.nrn = nrn;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nrn nrn1 = (Nrn) o;
        return Objects.equals(nrn, nrn1.nrn) &&
                Objects.equals(product, nrn1.product) &&
                Objects.equals(region, nrn1.region) &&
                Objects.equals(account, nrn1.account) &&
                Objects.equals(resource, nrn1.resource);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nrn, product, region, account, resource);
    }

    @Override
    public String toString() {
        return "Nrn{" +
                "nrn='" + nrn + '\'' +
                ", product='" + product + '\'' +
                ", region='" + region + '\'' +
                ", account='" + account + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }


}
