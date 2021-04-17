package com.wenleicao.soutionmaker2;

public class ChemicalDataModel {
    private int Chemical_ID;
    private  String Brand;
    private String Name;
    private String Formula;
    private String Catalog_Number;
    private double Molecular_Weight;
    private String Type ;

//constructors


    public ChemicalDataModel(int chemical_ID, String brand, String name, String formula, String catalog_Number, double molecular_Weight, String type) {
        Chemical_ID = chemical_ID;
        Brand = brand;
        Name = name;
        Formula = formula;
        Catalog_Number = catalog_Number;
        Molecular_Weight = molecular_Weight;
        Type = type;
    }

    public ChemicalDataModel() {
    }

    //getter and setter


    public int getChemical_ID() {
        return Chemical_ID;
    }

    public void setChemical_ID(int chemical_ID) {
        Chemical_ID = chemical_ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFormula() {
        return Formula;
    }

    public void setFormula(String formula) {
        Formula = formula;
    }

    public String getCatalog_Number() {
        return Catalog_Number;
    }

    public void setCatalog_Number(String catalog_Number) {
        Catalog_Number = catalog_Number;
    }

    public double getMolecular_Weight() {
        return Molecular_Weight;
    }

    public void setMolecular_Weight(double molecular_Weight) {
        Molecular_Weight = molecular_Weight;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "ChemicalDataModel{" +
                "Chemical_ID=" + Chemical_ID +
                ", Brand='" + Brand + '\'' +
                ", Name='" + Name + '\'' +
                ", Formula='" + Formula + '\'' +
                ", Catalog_Number='" + Catalog_Number + '\'' +
                ", Molecular_Weight=" + Molecular_Weight +
                ", type='" + Type + '\'' +
                '}';
    }
}
