package com.example.lastheap;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ProductNdxpro implements Comparable<ProductNdxpro> {


    String code;

    String label;

    String type;

    String detailLabel;

    @JsonIgnore
    int orderNuml;



    String standard;

    public String getStandard() {
        return standard;
    }

    public ProductNdxpro(String code, String label, String type, String detailLabel, int orderNuml, String standard) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.detailLabel = detailLabel;
        this.orderNuml = orderNuml;
        this.standard = standard;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getDetailLabel() {
        return detailLabel;
    }

    public int getOrderNuml() {
        return orderNuml;
    }

    @Override
    public String toString() {
        return "ProductNdxpro{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", detailLabel='" + detailLabel + '\'' +
                ", orderNuml=" + orderNuml +
                ", standard='" + standard + '\'' +
                '}';
    }
    private static final List<String> a = List.of("라이선스 (NFLOW)","용역 (NFLOW)","라이선스 (NDX Pro)","용역 (NDX Pro)","R&D/지원사업");

    @Override
    public int compareTo(ProductNdxpro o) {
        return a.indexOf(this.getLabel())- a.indexOf(o.getLabel());


    }


//    @Override
//    public int compareTo(ProductNdxpro o) {
//        if(this.getDetailLabel().equals("NFLOW")){
//          if (this.getType().contains("라이선스")){
//              return -1;
//          }
//            return 1;
//        } else if(this.getDetailLabel().equals("NDX PRO")){
//            if (this.getType().contains("용역")){
//                return 1;
//            }
//            return -1;
//        }
//        else if(o.getDetailLabel().contains("R&D")){
//              return -1;
//        }
//        return 0;
//    }
}

