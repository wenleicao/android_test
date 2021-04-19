package com.wenleicao.soutionmaker2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {


    public static final String TABLE_CHEMICAL = "Chemical";
    public static final String COLUMN_BRAND = "Brand";
    public static final String Column_CHEMICAL_NAME = "Name";
    public static final String COLUMN_FORMULA = "Formula";
    public static final String COLUMN_CATALOG_NUMBER = "Catalog_Number";
    public static final String COLUMN_MOLECULAR_WEIGHT = "Molecular_Weight";
    public static final String COLUMN_TYPE = "Type";
    public static final String COLUMN_CHEMICAL_ID = "Chemical_ID";

    public SQLiteHelper(@Nullable Context context) {
        super(context, "SolutionMaker.db", null, 1);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String CreateTableStatement = "create table " + TABLE_CHEMICAL + " (\n" +
                COLUMN_CHEMICAL_ID + " Integer primary key,\n" +
                COLUMN_BRAND + " Varchar(50) not null,\t\n" +
                Column_CHEMICAL_NAME + " text not null,\n" +
                COLUMN_FORMULA + " Varchar(100),\t\n" +
                COLUMN_CATALOG_NUMBER + " Varchar(20) not null,\t\n" +
                COLUMN_MOLECULAR_WEIGHT + " numeric not null,\n" +
                COLUMN_TYPE + " varchar(10) not null default 'sys'\n" +
                ");";
        db.execSQL(CreateTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        String updateStatement  =
                        //"delete from Chemical where Type = 'Sys';\n " +
                       "insert into Chemical (Brand, name, formula, catalog_number, molecular_weight, Type)\n" +
                        "Values ('Sigma', 'Aluminum phosphate monobasic solution', 'Al(H2PO4)3', '6234', 317.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium acetate', 'CH3CO2NH4', ' A1542 ', 77.08, 'Sys'),\n" +
                               "('Sigma', 'Ammonium acetate', 'CH3CO2NH4', '372331', 77.08, 'Sys'),\n" +
                               "('Sigma', 'Ammonium acetate', 'CH3CO2NH4', '431311', 77.08, 'Sys'),\n" +
                               "('Sigma', 'Ammonium acetate', 'CH3CO2NH4', '238074', 77.08, 'Sys'),\n" +
                               "('Sigma', 'Ammonium bicarbonate', 'NH4HCO3', '11213', 79.06, 'Sys'),\n" +
                               "('Sigma', 'Ammonium bromide', 'NH4Br', '380008', 97.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium bromide', 'NH4Br', '467731', 97.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium bromide', 'NH4Br', '213349', 97.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium chloride', 'NH4Cl', ' A9434 ', 53.49, 'Sys'),\n" +
                               "('Sigma', 'Ammonium chloride', 'NH4Cl', '254134', 53.49, 'Sys'),\n" +
                               "('Sigma', 'Ammonium chloride', 'NH4Cl', '213330', 53.49, 'Sys'),\n" +
                               "('Sigma', 'Ammonium chloride', 'NH4Cl', '11209', 53.49, 'Sys'),\n" +
                               "('Sigma', 'Ammonium chloride', 'NH4Cl', '9724', 53.49, 'Sys'),\n" +
                               "('Sigma', 'Ammonium fluoride', 'NH4F', '216011', 37.04, 'Sys'),\n" +
                               "('Sigma', 'Ammonium hexafluorophosphate', 'NH4PF6', '216593', 163, 'Sys'),\n" +
                               "('Sigma', 'Ammonium hexafluorophosphate', 'NH4PF6', '201138', 163, 'Sys'),\n" +
                               "('Sigma', 'Ammonium hydrogensulfate', '(NH4)HSO4', '455849', 115.11, 'Sys'),\n" +
                               "('Sigma', 'Ammonium iodide', 'NH4I', '203467', 144.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium iodide', 'NH4I', '221937', 144.94, 'Sys'),\n" +
                               "('Sigma', 'Ammonium nitrate', 'NH4NO3', ' A3795 ', 80.04, 'Sys'),\n" +
                               "('Sigma', 'Ammonium nitrate', 'NH4NO3', ' A9642 ', 80.04, 'Sys'),\n" +
                               "('Sigma', 'Ammonium nitrate', 'NH4NO3', '221244', 80.04, 'Sys'),\n" +
                               "('Sigma', 'Ammonium nitrate', 'NH4NO3', ' A7455 ', 80.04, 'Sys'),\n" +
                               "('Sigma', 'Ammonium phosphate dibasic', '(NH4)2HPO4', '215996', 132.06, 'Sys'),\n" +
                               "('Sigma', 'Ammonium phosphate monobasic', 'NH4H2PO4', ' A3048 ', 115.03, 'Sys'),\n" +
                               "('Sigma', 'Ammonium phosphate monobasic', 'NH4H2PO4', '467782', 115.03, 'Sys'),\n" +
                               "('Sigma', 'Ammonium phosphate monobasic', 'NH4H2PO4', '216003', 115.03, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfamate', 'NH4SO3NH2', ' A2585 ', 114.12, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfamate', 'NH4SO3NH2', '228745', 114.12, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfate', '(NH4)2SO4', ' A4418 ', 132.14, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfate', '(NH4)2SO4', ' A3920 ', 132.14, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfate', '(NH4)2SO4', ' A4915 ', 132.14, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfide solution', '(NH4)2S', ' A1952 ', 68.14, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfite monohydrate', '(NH4)2SO3 ?? H2O', '358983', 134.16, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sulfite solution', '(NH4)2SO3', '11229', 116.14, 'Sys'),\n" +
                               "('Sigma', 'Ammonium thiosulfate', '(NH4)2S2O3', '336726', 148.21, 'Sys'),\n" +
                               "('Sigma', 'Ammonium trifluoroacetate', 'CF3CO2NH4', '238732', 131.05, 'Sys'),\n" +
                               "('Sigma', 'Ammonium trifluoromethanesulfonate', 'CF3SO3NH4', '345865', 167.11, 'Sys'),\n" +
                               "('Sigma', 'Barium acetate', '(CH3COO)2Ba', '255912', 255.42, 'Sys'),\n" +
                               "('Sigma', 'Barium acetate', '(CH3COO)2Ba', '243671', 255.42, 'Sys'),\n" +
                               "('Sigma', 'Barium acetate', '(CH3COO)2Ba', '32305', 255.42, 'Sys'),\n" +
                               "('Sigma', 'Barium chlorate monohydrate', 'Ba(ClO3)2??H2O', '244554', 322.24, 'Sys'),\n" +
                               "('Sigma', 'Barium chloride', 'BaCl2', '202738', 208.23, 'Sys'),\n" +
                               "('Sigma', 'Barium chloride', 'BaCl2', '342920', 208.23, 'Sys'),\n" +
                               "('Sigma', 'Barium iodate monohydrate', 'Ba(IO3)2 ?? H2O', '444162', 505.15, 'Sys'),\n" +
                               "('Sigma', 'Barium iodide dihydrate', 'Bal2 ?? 2H2O', '566268', 427.17, 'Sys'),\n" +
                               "('Sigma', 'Barium iodide dihydrate', 'Bal2 ?? 2H2O', '223808', 427.17, 'Sys'),\n" +
                               "('Sigma', 'Barium metaphosphate', 'Ba(PO3)2', '433918', 295.27, 'Sys'),\n" +
                               "('Sigma', 'Barium nitrate', 'Ba(NO3)2', '202754', 261.34, 'Sys'),\n" +
                               "('Sigma', 'Barium nitrate', 'Ba(NO3)2', '217581', 261.34, 'Sys'),\n" +
                               "('Sigma', 'Barium sulfate', 'BaSO4', ' B8675 ', 233.39, 'Sys'),\n" +
                               "('Sigma', 'Barium sulfate', 'BaSO4', '202762', 233.39, 'Sys'),\n" +
                               "('Sigma', 'Barium thiosulfate', 'BaS2O3', '437417', 249.46, 'Sys'),\n" +
                               "('Sigma', 'Barium trifluoromethanesulfonate', '(CF3SO3)2Ba', '419087', 435.47, 'Sys'),\n" +
                               "('Sigma', 'Beryllium sulfate tetrahydrate', 'BeSO4 ?? 4H2O', '202789', 177.14, 'Sys'),\n" +
                               "('Sigma', 'Calcium acetate hydrate', '(CH3COO)2Ca ?? xH2O', '25011',  158.17 , 'Sys'),\n" +
                               "('Sigma', 'Calcium acetate monohydrate', 'Ca(CH3CO2)2 ?? H2O', '402850', 176.18, 'Sys'),\n" +
                               "('Sigma', 'Calcium chloride', 'CaCl2', ' C5670 ', 110.98, 'Sys'),\n" +
                               "('Sigma', 'Calcium chloride', 'CaCl2', '499609', 110.98, 'Sys'),\n" +
                               "('Sigma', 'Calcium chloride', 'CaCl2', '383147', 110.98, 'Sys'),\n" +
                               "('Sigma', 'Calcium chloride hydrate', 'CaCl2 ?? xH2O', '202940',  110.98 , 'Sys'),\n" +
                               "('Sigma', 'Calcium iodate', 'Ca(IO3)2', '341606', 389.88, 'Sys'),\n" +
                               "('Sigma', 'Calcium iodide', 'CaI2', '590703', 293.89, 'Sys'),\n" +
                               "('Sigma', 'Calcium metaborate', 'Ca(BO2)2 ?? 2H2O', '11618', 161.73, 'Sys'),\n" +
                               "('Sigma', 'Calcium nitrate hydrate', 'Ca(NO3)2??xH2O', '202967',  164.09 , 'Sys'),\n" +
                               "('Sigma', 'Calcium nitrate tetrahydrate', 'Ca(NO3)2 ?? 4H2O', ' C4955 ', 236.15, 'Sys'),\n" +
                               "('Sigma', 'Calcium nitrate tetrahydrate', 'Ca(NO3)2 ?? 4H2O', ' C1396 ', 236.15, 'Sys'),\n" +
                               "('Sigma', 'Calcium nitrate tetrahydrate', 'Ca(NO3)2 ?? 4H2O', ' C2786 ', 236.15, 'Sys'),\n" +
                               "('Sigma', 'Calcium nitrate tetrahydrate', 'Ca(NO3)2 ?? 4H2O', '237124', 236.15, 'Sys'),\n" +
                               "('Sigma', 'Calcium phosphate dibasic', 'CaHPO4', ' C7263 ', 136.06, 'Sys'),\n" +
                               "('Sigma', 'Calcium phosphate tribasic', '[Ca5(OH)(PO4)3]x', ' C3161 ', 502.31, 'Sys'),\n" +
                               "('Sigma', 'Calcium phosphate tribasic', '[Ca5(OH)(PO4)3]x', ' C5267 ', 502.31, 'Sys'),\n" +
                               "('Sigma', 'Calcium phosphate dibasic dihydrate', 'CaHPO4 ?? 2H2O', '4231', 172.09, 'Sys'),\n" +
                               "('Sigma', 'Calcium phosphate monobasic monohydrate', 'Ca(H2PO4)2 ?? H2O', '21053', 252.07, 'Sys'),\n" +
                               "('Sigma', 'Calcium silicide', 'CaSi2', '21240', 96.25, 'Sys'),\n" +
                               "('Sigma', 'Calcium sulfate', 'CaSO4', '255696', 136.14, 'Sys'),\n" +
                               "('Sigma', 'Calcium sulfate dihydrate', 'CaSO4 ?? 2H2O', '12056', 172.17, 'Sys'),\n" +
                               "('Sigma', 'Calcium sulfate dihydrate', 'CaSO4 ?? 2H2O', '255548', 172.17, 'Sys'),\n" +
                               "('Sigma', 'Calcium sulfate hemihydrate', 'CaSO4 ?? 0.5H2O', '12090', 145.15, 'Sys'),\n" +
                               "('Sigma', 'Calcium trifluoromethanesulfonate', '(CF3SO3)2Ca', '515892', 338.22, 'Sys'),\n" +
                               "('Sigma', 'Hydroxyapatite', '[Ca5(OH)(PO4)3]x', '574791', 502.31, 'Sys'),\n" +
                               "('Sigma', 'Cesium acetate', 'CH3COOCs', '450154', 191.95, 'Sys'),\n" +
                               "('Sigma', 'Cesium acetate', 'CH3COOCs', '329827', 191.95, 'Sys'),\n" +
                               "('Sigma', 'Cesium acetate', 'CH3COOCs', '200794', 191.95, 'Sys'),\n" +
                               "('Sigma', 'Cesium bromide', 'CsBr', '203017', 212.81, 'Sys'),\n" +
                               "('Sigma', 'Cesium bromide', 'CsBr', '202142', 212.81, 'Sys'),\n" +
                               "('Sigma', 'Cesium carbonate', 'Cs2CO3', '20959', 325.82, 'Sys'),\n" +
                               "('Sigma', 'Cesium chloride', 'CsCl', '203025', 168.36, 'Sys'),\n" +
                               "('Sigma', 'Cesium chloride', 'CsCl', '562599', 168.36, 'Sys'),\n" +
                               "('Sigma', 'Cesium chloride', 'CsCl', ' C3032 ', 168.36, 'Sys'),\n" +
                               "('Sigma', 'Cesium chloride', 'CsCl', ' C4036 ', 168.36, 'Sys'),\n" +
                               "('Sigma', 'Cesium formate', 'HCOOCs', '433764', 177.92, 'Sys'),\n" +
                               "('Sigma', 'Cesium hydrogencarbonate', 'CsHCO3', '218227', 193.92, 'Sys'),\n" +
                               "('Sigma', 'Cesium methanesulfonate', 'CH3O3SCs', ' C1426 ', 228, 'Sys'),\n" +
                               "('Sigma', 'Cesium triiodide', 'CsI3', '483338', 513.62, 'Sys'),\n" +
                               "('Sigma', 'Bis(trifluoromethane)sulfonimide lithium salt', 'CF3SO2NLiSO2CF3', '544094', 287.09, 'Sys'),\n" +
                               "('Sigma', 'Bis(trifluoromethane)sulfonimide lithium salt', 'CF3SO2NLiSO2CF3', '449504', 287.09, 'Sys'),\n" +
                               "('Sigma', 'Lithium acetate', 'LiOOCCH3', '517992', 65.99, 'Sys'),\n" +
                               "('Sigma', 'Lithium acetate dihydrate', 'CH3COOLi ?? 2H2O', ' L4158 ', 102.02, 'Sys'),\n" +
                               "('Sigma', 'Lithium acetate dihydrate', 'CH3COOLi ?? 2H2O', ' L6883 ', 102.02, 'Sys'),\n" +
                               "('Sigma', 'Lithium bromide', 'LiBr', '229733', 86.85, 'Sys'),\n" +
                               "('Sigma', 'Lithium bromide', 'LiBr', '62463', 86.85, 'Sys'),\n" +
                               "('Sigma', 'Lithium chloride', 'LiCl', ' L4408 ', 42.39, 'Sys'),\n" +
                               "('Sigma', 'Lithium chloride', 'LiCl', ' L9650 ', 42.39, 'Sys'),\n" +
                               "('Sigma', 'Lithium chloride', 'LiCl', '73036', 42.39, 'Sys'),\n" +
                               "('Sigma', 'Lithium chloride', 'LiCl', '310468', 42.39, 'Sys'),\n" +
                               "('Sigma', 'Lithium chloride hydrate', 'LiCl ?? xH2O', '298328',  42.39 , 'Sys'),\n" +
                               "('Sigma', 'Lithium fluoride', 'LiF', '669431', 25.94, 'Sys'),\n" +
                               "('Sigma', 'Lithium formate monohydrate', 'HCO2Li ?? H2O', '442690', 69.97, 'Sys'),\n" +
                               "('Sigma', 'Lithium hexafluorophosphate', 'LiPF6', '450227', 151.91, 'Sys'),\n" +
                               "('Sigma', 'Lithium hexafluorophosphate', 'LiPF6', '201146', 151.91, 'Sys'),\n" +
                               "('Sigma', 'Lithium iodate', 'LiIO3', '443964', 181.84, 'Sys'),\n" +
                               "('Sigma', 'Lithium iodide', 'LiI', '218219', 133.85, 'Sys'),\n" +
                               "('Sigma', 'Lithium iodide', 'LiI', '518018', 133.85, 'Sys'),\n" +
                               "('Sigma', 'Lithium iodoacetate', 'ICH2COOLi', '57857', 191.88, 'Sys'),\n" +
                               "('Sigma', 'Lithium metaborate', 'LiBO2', '402966', 49.75, 'Sys'),\n" +
                               "('Sigma', 'Lithium nitrate', 'LiNO3', '229741', 68.95, 'Sys'),\n" +
                               "('Sigma', 'Lithium phosphate', 'Li3PO4', '338893', 115.79, 'Sys'),\n" +
                               "('Sigma', 'Lithium phosphate monobasic', 'LiH2PO4', '563161', 103.93, 'Sys'),\n" +
                               "('Sigma', 'Lithium phosphate monobasic', 'LiH2PO4', '442682', 103.93, 'Sys'),\n" +
                               "('Sigma', 'Lithium sulfate', 'Li2SO4', '203653', 109.94, 'Sys'),\n" +
                               "('Sigma', 'Lithium sulfate', 'Li2SO4', ' L6375 ', 109.94, 'Sys'),\n" +
                               "('Sigma', 'Lithium sulfate', 'Li2SO4', '62613', 109.94, 'Sys'),\n" +
                               "('Sigma', 'Lithium sulfate monohydrate', 'Li2SO4 ?? H2O', '398152', 127.96, 'Sys'),\n" +
                               "('Sigma', 'Lithium trifluoroacetate', 'CF3CO2Li', '287679', 119.96, 'Sys'),\n" +
                               "('Sigma', 'Lithium trifluoromethanesulfonate', 'CF3SO3Li', '481548', 156.01, 'Sys'),\n" +
                               "('Sigma', 'Lithium trifluoromethanesulfonate', 'CF3SO3Li', '282669', 156.01, 'Sys'),\n" +
                               "('Sigma', 'Magnesium acetate tetrahydrate', '(CH3COO)2Mg ?? 4H2O', ' M2545 ', 214.45, 'Sys'),\n" +
                               "('Sigma', 'Magnesium acetate tetrahydrate', '(CH3COO)2Mg ?? 4H2O', ' M5661 ', 214.45, 'Sys'),\n" +
                               "('Sigma', 'Magnesium acetate tetrahydrate', '(CH3COO)2Mg ?? 4H2O', '228648', 214.45, 'Sys'),\n" +
                               "('Sigma', 'Magnesium bromide', 'MgBr2', '495093', 184.11, 'Sys'),\n" +
                               "('Sigma', 'Magnesium bromide', 'MgBr2', '360074', 184.11, 'Sys'),\n" +
                               "('Sigma', 'Magnesium bromide hexahydrate', 'MgBr2 ?? 6H2O', '216844', 292.2, 'Sys'),\n" +
                               "('Sigma', 'Magnesium bromide ethyl etherate', 'MgBr2 ?? O(C2H5)2', '225959', 258.23, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride', 'MgCl2', ' M8266 ', 95.21, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride', 'MgCl2', ' M4880 ', 95.21, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride hexahydrate', 'MgCl2 ?? 6H2O', ' M2670 ', 203.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride hexahydrate', 'MgCl2 ?? 6H2O', ' M2393 ', 203.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride hexahydrate', 'MgCl2 ?? 6H2O', ' M9272 ', 203.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride hexahydrate', 'MgCl2 ?? 6H2O', '13152', 203.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chloride hexahydrate', 'MgCl2 ?? 6H2O', '63033', 203.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium chromate hydrate', 'MgCrO4 ?? XH2O', '415189',  140.30 , 'Sys'),\n" +
                               "('Sigma', 'Magnesium fluoride', 'MgF2', '378836', 62.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium fluoride', 'MgF2', '1192', 62.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium fluoride', 'MgF2', '394297', 62.3, 'Sys'),\n" +
                               "('Sigma', 'Magnesium iodide', 'MgI2', '394599', 278.11, 'Sys'),\n" +
                               "('Sigma', 'Magnesium nitrate hexahydrate', 'Mg(NO3)2 ?? 6H2O', ' M5296 ', 256.41, 'Sys'),\n" +
                               "('Sigma', 'Magnesium nitrate hexahydrate', 'Mg(NO3)2 ?? 6H2O', '203696', 256.41, 'Sys'),\n" +
                               "('Sigma', 'Magnesium nitrate hexahydrate', 'Mg(NO3)2 ?? 6H2O', '237175', 256.41, 'Sys'),\n" +
                               "('Sigma', 'Magnesium phosphate hydrate', 'Mg3(PO4)2??xH2O', '344702',  262.86 , 'Sys'),\n" +
                               "('Sigma', 'Magnesium phosphate tribasic octahydrate', 'Mg3(PO4)2 ?? 8H2O', '63132', 406.98, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate heptahydrate', 'MgSO4 ?? 7H2O', '230391', 246.47, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate heptahydrate', 'MgSO4 ?? 7H2O', ' M5921 ', 246.47, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate heptahydrate', 'MgSO4 ?? 7H2O', ' M2773 ', 246.47, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate heptahydrate', 'MgSO4 ?? 7H2O', '63142', 246.47, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate heptahydrate', 'MgSO4 ?? 7H2O', '13142', 246.47, 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate hydrate', 'MgSO4 ?? aq', '63139',  120.37 , 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate hydrate', 'MgSO4 ?? aq', '13143',  120.37 , 'Sys'),\n" +
                               "('Sigma', 'Magnesium sulfate monohydrate', 'MgSO4 ?? H2O', '434183', 138.38, 'Sys'),\n" +
                               "('Sigma', 'Magnesium trifluoromethanesulfonate', '(CF3SO3)2Mg', '337986', 322.44, 'Sys'),\n" +
                               "('Sigma', 'Potassium acetate', 'CH3COOK', ' P1190 ', 98.14, 'Sys'),\n" +
                               "('Sigma', 'Potassium acetate', 'CH3COOK', '236497', 98.14, 'Sys'),\n" +
                               "('Sigma', 'Potassium acetate', 'CH3COOK', '25059', 98.14, 'Sys'),\n" +
                               "('Sigma', 'Potassium bicarbonate', 'KHCO3', '431583', 100.12, 'Sys'),\n" +
                               "('Sigma', 'Potassium bicarbonate', 'KHCO3', '237205', 100.12, 'Sys'),\n" +
                               "('Sigma', 'Potassium bicarbonate', 'KHCO3', '60340', 100.12, 'Sys'),\n" +
                               "('Sigma', 'Potassium bicarbonate', 'KHCO3', '12602', 100.12, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromate', 'KBrO3', '309087', 167, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', ' P0838 ', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', '449962', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', '451010', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', '229792', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', '243418', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium bromide', 'KBr', '2110', 119, 'Sys'),\n" +
                               "('Sigma', 'Potassium chlorate', 'KClO3', '255572', 122.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chlorate', 'KClO3', '12634', 122.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chlorate', 'KClO3', '60127', 122.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', ' P9333 ', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', ' P9541 ', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', ' P5405 ', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', '409316', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', '204099', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', ' P3911 ', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', '12636', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chloride', 'KCl', '60126', 74.55, 'Sys'),\n" +
                               "('Sigma', 'Potassium chromate', 'K2CrO4', '216615', 194.19, 'Sys'),\n" +
                               "('Sigma', 'Potassium chromate', 'K2CrO4', '12249', 194.19, 'Sys'),\n" +
                               "('Sigma', 'Potassium disulfite', 'K2S2O5', ' P2522 ', 222.32, 'Sys'),\n" +
                               "('Sigma', 'Potassium disulfite', 'K2S2O5', '12619', 222.32, 'Sys'),\n" +
                               "('Sigma', 'Potassium fluorosulfate', 'FSO3K', '435821', 138.16, 'Sys'),\n" +
                               "('Sigma', 'Potassium hexafluorophosphate', 'KPF6', '515973', 184.06, 'Sys'),\n" +
                               "('Sigma', 'Potassium hexafluorophosphate', 'KPF6', '200913', 184.06, 'Sys'),\n" +
                               "('Sigma', 'Potassium hydrogen phthalate', 'HOOCC6H4COOK', ' P1088 ', 204.22, 'Sys'),\n" +
                               "('Sigma', 'Potassium hydroxide', 'KOH', '757551', 56.11, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodate', 'KIO3', '215929', 214, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodide', 'KI', ' P2963 ', 166, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodide', 'KI', ' P8166 ', 166, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodide', 'KI', '60422', 166, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodide', 'KI', '204102', 166, 'Sys'),\n" +
                               "('Sigma', 'Potassium iodide', 'KI', '221945', 166, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate dibasic', 'K2HPO4', ' P3786 ', 174.18, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate dibasic trihydrate', 'K2HPO4 ?? 3H2O', ' P9666 ', 228.22, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', ' P5655 ', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', ' P9791 ', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', '229806', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', ' P0662 ', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', '4243', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate monobasic', 'KH2PO4', '60229', 136.09, 'Sys'),\n" +
                               "('Sigma', 'Potassium phosphate tribasic', 'K3PO4', ' P5629 ', 212.27, 'Sys'),\n" +
                               "('Sigma', 'Potassium pyrophosphate', 'K4P2O7', '322431', 330.34, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfate', 'K2SO4', ' P9458 ', 174.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfate', 'K2SO4', ' P8541 ', 174.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfate', 'K2SO4', '204129', 174.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfate', 'K2SO4', '221325', 174.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfate', 'K2SO4', '223492', 174.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium sulfite', 'K2SO3', '658510', 158.26, 'Sys'),\n" +
                               "('Sigma', 'Potassium thioacetate', 'CH3COSK', '241776', 114.21, 'Sys'),\n" +
                               "('Sigma', 'Potassium thiosulfate', 'K2S2O3', '12669', 190.32, 'Sys'),\n" +
                               "('Sigma', 'Potassium trifluoroacetate', 'CF3COOK', '281883', 152.11, 'Sys'),\n" +
                               "('Sigma', 'Rubidium bromide', 'RbBr', '336149', 165.37, 'Sys'),\n" +
                               "('Sigma', 'Rubidium chloride', 'RbCl', '204250', 120.92, 'Sys'),\n" +
                               "('Sigma', 'Rubidium chloride', 'RbCl', '215260', 120.92, 'Sys'),\n" +
                               "('Sigma', 'Rubidium chloride', 'RbCl', '83979', 120.92, 'Sys'),\n" +
                               "('Sigma', 'Rubidium chloride', 'RbCl', '83980', 120.92, 'Sys'),\n" +
                               "('Sigma', 'Rubidium chromate', 'Rb2CrO4', '400599', 286.93, 'Sys'),\n" +
                               "('Sigma', 'Rubidium fluoride', 'RbF', '251429', 104.47, 'Sys'),\n" +
                               "('Sigma', 'Rubidium iodide', 'RbI', '251445', 212.37, 'Sys'),\n" +
                               "('Sigma', 'Rubidium nitrate', 'RbNO3', '204269', 147.47, 'Sys'),\n" +
                               "('Sigma', 'Rubidium nitrate', 'RbNO3', '289299', 147.47, 'Sys'),\n" +
                               "('Sigma', 'Rubidium sulfate', 'Rb2SO4', '289280', 267, 'Sys'),\n" +
                               "('Sigma', 'Borax Anhydrous', 'Na2B4O7', '71996', 201.22, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate', 'CH3COONa', ' S2889 ', 82.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate', 'CH3COONa', ' S5636 ', 82.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate', 'CH3COONa', ' S7545 ', 82.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate', 'CH3COONa', '241245', 82.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate', 'CH3COONa', '25023', 82.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate trihydrate', 'CH3COONa ?? 3H2O', ' S7670 ', 136.08, 'Sys'),\n" +
                               "('Sigma', 'Sodium acetate trihydrate', 'CH3COONa ?? 3H2O', '236500', 136.08, 'Sys'),\n" +
                               "('Sigma', 'Sodium bicarbonate', 'NaHCO3', ' S5761 ', 84.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium bicarbonate', 'NaHCO3', ' S6297 ', 84.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium bicarbonate', 'NaHCO3', ' S6014 ', 84.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium bicarbonate', 'NaHCO3', '13433', 84.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium bicarbonate', 'NaHCO3', '71631', 84.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium bisulfite solution', 'NaHSO3', '13438', 104.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium bromate', 'NaBrO3', '2151', 150.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium bromide', 'NaBr', ' S4547 ', 102.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium bromide', 'NaBr', '229881', 102.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium bromide', 'NaBr', '310506', 102.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium chlorate', 'NaClO3', '403016', 106.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', ' S3014 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', ' S5886 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', ' S6191 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', ' S9888 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', '13423', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride', 'NaCl', '71383', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride solution', 'NaCl', '71392', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride solution', 'NaCl', ' S0817 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloride solution', 'NaCl', ' S8776 ', 58.44, 'Sys'),\n" +
                               "('Sigma', 'Sodium chloroacetate', 'ClCH2COONa', '291773', 116.48, 'Sys'),\n" +
                               "('Sigma', 'Sodium chlorodifluoroacetate', 'ClCF2CO2Na', '374067', 152.46, 'Sys'),\n" +
                               "('Sigma', 'Sodium chromate', 'Na2CrO4', '307831', 161.97, 'Sys'),\n" +
                               "('Sigma', 'Sodium chromate tetrahydrate', 'Na2CrO4 ?? 4H2O', '216623', 234.03, 'Sys'),\n" +
                               "('Sigma', 'Sodium dichloroacetate', 'Cl2CHCO2Na', '347795', 150.92, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride', 'NaF', ' S7920 ', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride', 'NaF', ' S6776 ', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride', 'NaF', '450022', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride', 'NaF', '201154', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride', 'NaF', '1148', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluoride 0.5 M solution', 'NaF', '67414', 41.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium fluorophosphate', 'Na2FPO3', '344443', 143.95, 'Sys'),\n" +
                               "('Sigma', 'Sodium formate', 'HCOONa', '247596', 68.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium hexafluorophosphate', 'NaPF6', '208051', 167.95, 'Sys'),\n" +
                               "('Sigma', 'Sodium hydrogen difluoride', 'NaHF2', '437646', 61.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium hydrogen sulfate', 'NaHSO4', '307823', 120.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium hydrosulfide hydrate', 'NaSH??xH2O', '161527',  56.06 , 'Sys'),\n" +
                               "('Sigma', 'Sodium hydrosulfite', 'NaO2SSO2Na', '71699', 174.11, 'Sys'),\n" +
                               "('Sigma', 'Sodium trans-hyponitrite hydrate', 'Na2N2O2 ?? xH2O', '460990',  105.99 , 'Sys'),\n" +
                               "('Sigma', 'Sodium hypophosphite', 'NaPH2O2', '4434', 87.98, 'Sys'),\n" +
                               "('Sigma', 'Sodium hypophosphite hydrate', 'NaH2PO2 ?? xH2O', '243663',  87.98 , 'Sys'),\n" +
                               "('Sigma', 'Sodium hypophosphite monohydrate', 'NaH2PO2 ?? H2O', ' S5012 ', 105.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium iodate', 'NaIO3', ' S4007 ', 197.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium iodide', 'NaI', '409286', 149.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium iodide', 'NaI', '383112', 149.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium iodide', 'NaI', '3129', 149.89, 'Sys'),\n" +
                               "('Sigma', 'Sodium metabisulfite', 'Na2S2O5', '13459', 190.11, 'Sys'),\n" +
                               "('Sigma', 'Sodium metabisulfite', 'Na2S2O5', '71932', 190.11, 'Sys'),\n" +
                               "('Sigma', 'Sodium metasilicate', 'Na2SiO3', '307815', 122.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium metasilicate pentahydrate', 'Na2SiO3 ?? 5H2O', '71746', 212.14, 'Sys'),\n" +
                               "('Sigma', 'Sodium methanesulfonate', 'CH3SO3Na', '304506', 118.09, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrate', 'NaNO3', ' S5022 ', 84.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrate', 'NaNO3', '229938', 84.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrate', 'NaNO3', ' S8170 ', 84.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrate', 'NaNO3', '221341', 84.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrate', 'NaNO3', '13444', 84.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrite', 'NaNO2', '563218', 69, 'Sys'),\n" +
                               "('Sigma', 'Sodium nitrite', 'NaNO2', '237213', 69, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate', 'Na3PO4', '342483', 163.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic', 'Na2HPO4', ' S3264 ', 141.96, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic', 'Na2HPO4', ' S5136 ', 141.96, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic', 'Na2HPO4', ' S9763 ', 141.96, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic', 'Na2HPO4', '71642', 141.96, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic dihydrate', 'Na2HPO4 ?? 2H2O', '71645', 177.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic dihydrate', 'Na2HPO4 ?? 2H2O', '71662', 177.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic dodecahydrate', 'Na2HPO4 ?? 12H2O', '4273', 358.14, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic dodecahydrate', 'Na2HPO4 ?? 12H2O', '71663', 358.14, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic heptahydrate', 'Na2HPO4 ?? 7H2O', '431478', 268.07, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate dibasic heptahydrate', 'Na2HPO4 ?? 7H2O', ' S9390 ', 268.07, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic', 'NaH2PO4', ' S3139 ', 119.98, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic', 'NaH2PO4', ' S5011 ', 119.98, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic', 'NaH2PO4', '229903', 119.98, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic', 'NaH2PO4', '71496', 119.98, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic monohydrate', 'NaH2PO4 ?? H2O', ' S9638 ', 137.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic monohydrate', 'NaH2PO4 ?? H2O', ' S3522 ', 137.99, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic dihydrate', 'NaH2PO4 ?? 2H2O', '71500', 156.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate monobasic dihydrate', 'NaH2PO4 ?? 2H2O', '4269', 156.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate tribasic dodecahydrate', 'Na3PO4 ?? 12H2O', ' S7778 ', 380.12, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate tribasic dodecahydrate', 'Na3PO4 ?? 12H2O', '4277', 380.12, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphate tribasic dodecahydrate', 'Na3PO4 ?? 12H2O', '222003', 380.12, 'Sys'),\n" +
                               "('Sigma', 'Sodium phosphite dibasic pentahydrate', 'Na2HPO3 ?? 5H2O', '4283', 216.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium pyrophosphate decahydrate', 'Na4P2O7 ?? 10H2O', '221368', 446.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium pyrophosphate dibasic', 'Na2H2P2O7', ' P8135 ', 221.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium pyrophosphate tetrabasic', 'Na4P2O7', ' P8010 ', 265.9, 'Sys'),\n" +
                               "('Sigma', 'Sodium pyrophosphate tetrabasic decahydrate', 'Na4P2O7 ?? 10H2O', ' S6422 ', 446.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenate', 'Na2SeO4', ' S8295 ', 188.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenate', 'Na2SeO4', ' S0882 ', 188.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenate', 'Na2SeO4', '71948', 188.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenite', 'Na2SeO3', ' S9133 ', 172.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenite', 'Na2SeO3', ' S5261 ', 172.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenite', 'Na2SeO3', '71950', 172.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium selenite', 'Na2SeO3', '214485', 172.94, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', '204447', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', '239313', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', '238597', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', ' S5640 ', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', ' S6547 ', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', '13464', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate', 'Na2SO4', '71963', 142.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfate decahydrate', 'Na2SO4 ?? 10H2O', '403008', 322.2, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfite', 'Na2SO3', ' S0505 ', 126.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfite', 'Na2SO3', '239321', 126.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium sulfite', 'Na2SO3', ' S4672 ', 126.04, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetraborate', 'Na2B4O7', '229946', 201.22, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetraborate', 'Na2B4O7', '221732', 201.22, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetraborate decahydrate', 'Na2B4O7 ?? 10H2O', ' S9640 ', 381.37, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetraborate decahydrate', 'Na2B4O7 ?? 10H2O', ' B3545 ', 381.37, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetraborate decahydrate', 'Na2B4O7 ?? 10H2O', '11625', 381.37, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetrathionate dihydrate', 'NaO3SS2SO3Na ?? 2H2O', ' S5758 ', 306.27, 'Sys'),\n" +
                               "('Sigma', 'Sodium tetrathionate dihydrate', 'NaO3SS2SO3Na ?? 2H2O', '72030', 306.27, 'Sys'),\n" +
                               "('Sigma', 'Sodium thiophosphate tribasic hydrate', 'Na3PO3S ?? xH2O', ' S0764 ',  180.01 , 'Sys'),\n" +
                               "('Sigma', 'Sodium thiosulfate', 'Na2S2O3', '72049', 158.11, 'Sys'),\n" +
                               "('Sigma', 'Sodium thiosulfate', 'Na2S2O3', '563188', 158.11, 'Sys'),\n" +
                               "('Sigma', 'Sodium thiosulfate pentahydrate', 'Na2S2O3 ?? 5H2O', ' S6672 ', 248.18, 'Sys'),\n" +
                               "('Sigma', 'Sodium thiosulfate pentahydrate', 'Na2S2O3 ?? 5H2O', '217247', 248.18, 'Sys'),\n" +
                               "('Sigma', 'Sodium thiosulfate pentahydrate', 'Na2S2O3 ?? 5H2O', '13479', 248.18, 'Sys'),\n" +
                               "('Sigma', 'Sodium trichloroacetate', 'CCl3CO2Na', '190780', 185.37, 'Sys'),\n" +
                               "('Sigma', 'Sodium trifluoroacetate', 'CF3COONa', '132101', 136.01, 'Sys'),\n" +
                               "('Sigma', 'Sodium trifluoromethanesulfonate', 'CF3SO3Na', '367907', 172.06, 'Sys'),\n" +
                               "('Sigma', 'Sodium triphosphate pentabasic', 'Na5P3O10', '72061', 367.86, 'Sys'),\n" +
                               "('Sigma', 'Trisodium trimetaphosphate', 'Na3P3O9', ' T5508 ', 305.89, 'Sys'),\n" +
                               "('Sigma', 'Strontium acetate', '(CH3CO2)2Sr', '437883', 205.71, 'Sys'),\n" +
                               "('Sigma', 'Strontium acetate', '(CH3CO2)2Sr', '388548', 205.71, 'Sys'),\n" +
                               "('Sigma', 'Strontium bromide', 'SrBr2', '430684', 247.43, 'Sys'),\n" +
                               "('Sigma', 'Strontium bromide hexahydrate', 'SrBr2 ?? 6H2O', '433438', 355.52, 'Sys'),\n" +
                               "('Sigma', 'Strontium chloride', 'SrCl2', '439665', 158.53, 'Sys'),\n" +
                               "('Sigma', 'Strontium chloride hexahydrate', 'SrCl2 ?? 6H2O', '204463', 266.62, 'Sys'),\n" +
                               "('Sigma', 'Strontium chloride hexahydrate', 'SrCl2 ?? 6H2O', '255521', 266.62, 'Sys'),\n" +
                               "('Sigma', 'Strontium chloride hexahydrate', 'SrCl2 ?? 6H2O', '31632', 266.62, 'Sys'),\n" +
                               "('Sigma', 'Strontium fluoride', 'SrF2', '652466', 125.62, 'Sys'),\n" +
                               "('Sigma', 'Strontium fluoride', 'SrF2', '450030', 125.62, 'Sys'),\n" +
                               "('Sigma', 'Strontium hydrogenphosphate', 'SrHPO4', '480428', 183.6, 'Sys'),\n" +
                               "('Sigma', 'Strontium iodide', 'SrI2', '466336', 341.43, 'Sys'),\n" +
                               "('Sigma', 'Strontium nitrate', 'Sr(NO3)2', '204498', 211.63, 'Sys'),\n" +
                               "('Sigma', 'Strontium nitrate', 'Sr(NO3)2', '243426', 211.63, 'Sys'),\n" +
                               "('Sigma', 'Aluminum potassium sulfate dodecahydrate', 'AlK(SO4)2 ?? 12H2O', ' A6435 ', 474.39, 'Sys'),\n" +
                               "('Sigma', 'Aluminum potassium sulfate dodecahydrate', 'AlK(SO4)2 ?? 12H2O', ' A7210 ', 474.39, 'Sys'),\n" +
                               "('Sigma', 'Ammonium magnesium phosphate hydrate', '(NH4)MgPO4 ?? xH2O', '529354',  137.31 , 'Sys'),\n" +
                               "('Sigma', 'Ammonium sodium phosphate dibasic tetrahydrate', 'NaNH4HPO4 ?? 4H2O', '4266', 209.07, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sodium phosphate dibasic tetrahydrate', 'NaNH4HPO4 ?? 4H2O', ' S9506 ', 209.07, 'Sys'),\n" +
                               "('Sigma', 'Ammonium sodium phosphate dibasic tetrahydrate', 'NaNH4HPO4 ?? 4H2O', ' S4172 ', 209.07, 'Sys'),\n" +
                               "('Sigma', 'Lithium potassium acetyl phosphate', 'CH3COOP(O)(OK)(OLi)', ' A0262 ', 184.06, 'Sys'),\n" +
                               "('Sigma', 'Lithium potassium acetyl phosphate', 'CH3COOP(O)(OK)(OLi)', '1409', 184.06, 'Sys'),\n" +
                               "('Sigma', 'Manganese(II) chloride tetrahydrate', 'MnCl2 ?? 4H2O', '221279', 197.91, 'Sys'),\n" +
                               "('Sigma', 'Manganese(II) sulfate monohydrate', 'MnSO4 ?? H2O', '221287', 169.02, 'Sys'),\n" +
                               "('Sigma', 'Scandium(III) chloride', 'ScCl3', '686077', 151.31, 'Sys');";

        if (oldversion <2) {
            db.execSQL(updateStatement);
                    }
        db.close();
    }

    public boolean addOne (ChemicalDataModel cdm) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_BRAND,cdm.getBrand());
        cv.put(Column_CHEMICAL_NAME, cdm.getName());
        cv.put(COLUMN_CATALOG_NUMBER,cdm.getCatalog_Number());
        cv.put(COLUMN_FORMULA,cdm.getFormula());
        cv.put(COLUMN_MOLECULAR_WEIGHT, cdm.getMolecular_Weight());
        cv.put(COLUMN_TYPE,"User");
        long insert = db.insert(TABLE_CHEMICAL,null, cv);
        db.close();
        if (insert == -1) {
            return false;

        }
        else {
            return true;
        }

    }

    public boolean deleteOne (ChemicalDataModel cdm) {
        SQLiteDatabase db = this.getWritableDatabase();
        String QueryString = "delete from " + TABLE_CHEMICAL + " Where " + COLUMN_CHEMICAL_ID + " = " + cdm.getChemical_ID();
        Cursor cursor = db.rawQuery(QueryString, null);
        if (cursor.moveToFirst()) {
            return true;
        }
        else
        {
            return false;
        }

    }

    public List<ChemicalDataModel> selectAll () {
        List returnlist = new ArrayList<ChemicalDataModel>();
        String Query  = "select * from " + TABLE_CHEMICAL + ";";
        SQLiteDatabase db = this.getReadableDatabase();
        //Cursor cur3 = db.rawQuery("select max(UnixTimeStamp) from Quote where EmoticonID=? and SubCategoryID=?" ,new String [] {String.valueOf(g),String.valueOf(s)});
        Cursor cur = db.rawQuery(Query,null);
        if (cur.moveToFirst()) {
            do {
                int Chemical_id = cur.getInt(0);
                String Brand = cur.getString(1);
                String Name = cur.getString(2);
                String Formula = cur.getString(3);
                String Catalog_Number = cur.getString(4);
                double Molecular_Weight = cur.getDouble(5);
                String Type = cur.getString(6);
                ChemicalDataModel cmd = new ChemicalDataModel(Chemical_id,Brand,Name,Formula,Catalog_Number,Molecular_Weight,Type);
                returnlist.add(cmd);
            }
            while (cur.moveToNext());
        }
        else
        {

        }
        cur.close();
        db.close();
        return returnlist;
    }



    public List<ChemicalDataModel> selectWithParam (String kn, String kf, String kc ) {
        List returnlist = new ArrayList<ChemicalDataModel>();
        String Query  = "select * from " + TABLE_CHEMICAL + ";";
        SQLiteDatabase db = this.getReadableDatabase();
        int g, s;
        Cursor cur = db.rawQuery("SELECT * FROM chemical WHERE UPPER(name) LIKE ? or UPPER(Formula) LIKE ? or UPPER(Catalog_Number) LIKE ?;" ,new String [] {kn,kf,kc});
        //Cursor cur = db.rawQuery(Query,null);
        if (cur.moveToFirst()) {
                do {
                  int Chemical_id = cur.getInt(0);
                  String Brand = cur.getString(1);
                  String Name = cur.getString(2);
                  String Formula = cur.getString(3);
                  String Catalog_Number = cur.getString(4);
                  double Molecular_Weight = cur.getDouble(5);
                  String Type = cur.getString(6);
                  ChemicalDataModel cmd = new ChemicalDataModel(Chemical_id,Brand,Name,Formula,Catalog_Number,Molecular_Weight,Type);
                  returnlist.add(cmd);
                    }
                while (cur.moveToNext());
        }
        else
        {

        }
        cur.close();
        db.close();
        return returnlist;
    }

}
