package com.unilever.unilever.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.unilever.unilever.controller.DBconnection;

//import org.apache.commons.math.MathException;
//import org.apache.commons.math.distribution.NormalDistribution;
//import org.apache.commons.math.distribution.NormalDistributionImpl;

public class DataCalculate {
	
	 public static void calculateData() {
		    DBconnection dbConnect = new DBconnection();
	   		Connection conn=null;
	   		PreparedStatement pstmt=null, pstmt1=null, pstmt2=null;
	       	Statement st = null, st1 = null, st2 = null, st3 = null;
	        ResultSet rs = null, rs1 = null, rs2 = null, rs3 = null;
	        ArrayList arrayList = new ArrayList<String>();
	     //   NormalDistribution d = null;
	   		conn= DBconnection.createDbConn(); 
	   		try {
	   			String sql= "insert into BIAS_CALCULATION(SKU,LOCATION,SKU_NO,Forecast_WEEK_352016,Sales_WEEK_352016,Forecast_WEEK_362016,Sales_WEEK_362016,Forecast_WEEK_372016,Sales_WEEK_372016,Forecast_WEEK_382016,Sales_WEEK_382016,Forecast_WEEK_392016,Sales_WEEK_392016,Forecast_WEEK_402016,Sales_WEEK_402016,Forecast_WEEK_412016,Sales_WEEK_412016,Forecast_WEEK_422016,Sales_WEEK_422016,Forecast_WEEK_432016,Sales_WEEK_432016,Forecast_WEEK_442016,Sales_WEEK_442016,Forecast_WEEK_452016,Sales_WEEK_452016,Forecast_WEEK_462016,Sales_WEEK_462016,Forecast_WEEK_472016,Sales_WEEK_472016,Forecast_WEEK_482016,Sales_WEEK_482016,Forecast_WEEK_492016,Sales_WEEK_492016,Forecast_WEEK_502016,Sales_WEEK_502016,Forecast_WEEK_512016,Sales_WEEK_512016,Forecast_WEEK_522016,Sales_WEEK_522016,Forecast_WEEK_012017,Sales_WEEK_012017,Forecast_WEEK_022017,Sales_WEEK_022017,Forecast_WEEK_032017,Sales_WEEK_032017,Forecast_WEEK_042017,Sales_WEEK_042017,Forecast_WEEK_052017,Sales_WEEK_052017,Forecast_WEEK_062017,Sales_WEEK_062017,Forecast_WEEK_072017,Sales_WEEK_072017,Forecast_WEEK_082017,Sales_WEEK_082017,Forecast_WEEK_092017,Sales_WEEK_092017,Forecast_WEEK_102017,Sales_WEEK_102017,Forecast_WEEK_112017,Sales_WEEK_112017,Forecast_WEEK_122017,Sales_WEEK_122017,Forecast_WEEK_132017,Sales_WEEK_132017,Forecast_WEEK_142017,Sales_WEEK_142017,Forecast_WEEK_152017,Sales_WEEK_152017,Forecast_WEEK_162017,Sales_WEEK_162017,Forecast_WEEK_172017,Sales_WEEK_172017,Forecast_WEEK_182017,Sales_WEEK_182017) (select a.SKU, a.LOCATION, a.SKU_CODE, a.Week35_2016, b.Week35_2016 Sales_Week35_2016, a.Week36_2016, b.Week36_2016 Sales_Week36_2016, a.Week37_2016, b.Week37_2016 Sales_Week37_2016, a.Week38_2016, b.Week38_2016 Sales_Week38_2016, a.Week39_2016, b.Week39_2016 Sales_Week39_2016, a.Week40_2016, b.Week40_2016 Sales_Week40_2016, a.Week41_2016, b.Week41_2016 Sales_Week41_2016, a.Week42_2016, b.Week42_2016 Sales_Week42_2016, a.Week43_2016, b.Week43_2016 Sales_Week43_2016, a.Week44_2016, b.Week44_2016 Sales_Week44_2016, a.Week45_2016, b.Week45_2016 Sales_Week45_2016, a.Week46_2016, b.Week46_2016 Sales_Week46_2016, a.Week47_2016, b.Week47_2016 Sales_Week47_2016, a.Week48_2016, b.Week48_2016 Sales_Week48_2016, a.Week49_2016, b.Week49_2016 Sales_Week49_2016, a.Week50_2016, b.Week50_2016 Sales_Week50_2016, a.Week51_2016, b.Week51_2016 Sales_Week51_2016, a.Week52_2016, b.Week52_2016 Sales_Week52_2016, a.Week01_2017, b.Week01_2017 Sales_Week01_2017, a.Week02_2017, b.Week02_2017 Sales_Week02_2017, a.Week03_2017, b.Week03_2017 Sales_Week03_2017, a.Week04_2017, b.Week04_2017 Sales_Week04_2017, a.Week05_2017, b.Week05_2017 Sales_Week05_2017, a.Week06_2017, b.Week06_2017 Sales_Week06_2017, a.Week07_2017, b.Week07_2017 Sales_Week07_2017, a.Week08_2017, b.Week08_2017 Sales_Week08_2017, a.Week09_2017, b.Week09_2017 Sales_Week09_2017, a.Week10_2017, b.Week10_2017 Sales_Week10_2017, a.Week11_2017, b.Week11_2017 Sales_Week11_2017, a.Week12_2017, b.Week12_2017 Sales_Week12_2017, a.Week13_2017, b.Week13_2017 Sales_Week13_2017, a.Week14_2017, b.Week14_2017 Sales_Week14_2017, a.Week15_2017, b.Week15_2017 Sales_Week15_2017, a.Week16_2017, b.Week16_2017 Sales_Week16_2017, a.Week17_2017, b.Week17_2017 Sales_Week17_2017, a.Week18_2017, b.Week18_2017 Sales_Week18_2017 from Past_Forecast a, Past_Sales b where a.SKU_CODE=b.SKU_CODE)";
				 pstmt=conn.prepareStatement(sql);			 
				 pstmt.executeUpdate();
				 
				 String sql1="select SKU,LOCATION,SKU_NO,Forecast_WEEK_352016,Sales_WEEK_352016,Forecast_WEEK_362016,Sales_WEEK_362016,Forecast_WEEK_372016,Sales_WEEK_372016,Forecast_WEEK_382016,Sales_WEEK_382016,Forecast_WEEK_392016,Sales_WEEK_392016,Forecast_WEEK_402016,Sales_WEEK_402016,Forecast_WEEK_412016,Sales_WEEK_412016,Forecast_WEEK_422016,Sales_WEEK_422016,Forecast_WEEK_432016,Sales_WEEK_432016,Forecast_WEEK_442016,Sales_WEEK_442016,Forecast_WEEK_452016,Sales_WEEK_452016,Forecast_WEEK_462016,Sales_WEEK_462016,Forecast_WEEK_472016,Sales_WEEK_472016,Forecast_WEEK_482016,Sales_WEEK_482016,Forecast_WEEK_492016,Sales_WEEK_492016,Forecast_WEEK_502016,Sales_WEEK_502016,Forecast_WEEK_512016,Sales_WEEK_512016,Forecast_WEEK_522016,Sales_WEEK_522016,Forecast_WEEK_012017,Sales_WEEK_012017,Forecast_WEEK_022017,Sales_WEEK_022017,Forecast_WEEK_032017,Sales_WEEK_032017,Forecast_WEEK_042017,Sales_WEEK_042017,Forecast_WEEK_052017,Sales_WEEK_052017,Forecast_WEEK_062017,Sales_WEEK_062017,Forecast_WEEK_072017,Sales_WEEK_072017,Forecast_WEEK_082017,Sales_WEEK_082017,Forecast_WEEK_092017,Sales_WEEK_092017,Forecast_WEEK_102017,Sales_WEEK_102017,Forecast_WEEK_112017,Sales_WEEK_112017,Forecast_WEEK_122017,Sales_WEEK_122017,Forecast_WEEK_132017,Sales_WEEK_132017,Forecast_WEEK_142017,Sales_WEEK_142017,Forecast_WEEK_152017,Sales_WEEK_152017,Forecast_WEEK_162017,Sales_WEEK_162017,Forecast_WEEK_172017,Sales_WEEK_172017,Forecast_WEEK_182017,Sales_WEEK_182017 from BIAS_CALCULATION";
				 st = conn.createStatement();
		         rs = st.executeQuery(sql1);
		         ResultSetMetaData metadata = rs.getMetaData();
		         int numberOfColumns = metadata.getColumnCount();
				 
		         while (rs.next()) {
		        	 /*int i = 1;
		             while(i <= numberOfColumns) {
		                 arrayList.add(rs.getString(i++));
		             }*/
		             String sku = rs.getString(1);
		             String location = rs.getString(2);
		             String skuNo = rs.getString(3);
		             float Fore_352016 = rs.getFloat(4);
		             float sale_352016 = rs.getFloat(5);
		             float Fore_362016 = rs.getFloat(6);
		             float sale_362016 = rs.getFloat(7);
		             float Fore_372016 = rs.getFloat(8);
		             float sale_372016 = rs.getFloat(9);
		             float Fore_382016 = rs.getFloat(10);
		             float sale_382016 = rs.getFloat(11);
		             float Fore_392016 = rs.getFloat(12);
		             float sale_392016 = rs.getFloat(13);
		             float Fore_402016 = rs.getFloat(14);
		             float sale_402016 = rs.getFloat(15);
		             float Fore_412016 = rs.getFloat(16);
		             float sale_412016 = rs.getFloat(17);
		             float Fore_422016 = rs.getFloat(18);
		             float sale_422016 = rs.getFloat(19);
		             float Fore_432016 = rs.getFloat(20);
		             float sale_432016 = rs.getFloat(21);
		             float Fore_442016 = rs.getFloat(22);
		             float sale_442016 = rs.getFloat(23);
		             float Fore_452016 = rs.getFloat(24);
		             float sale_452016 = rs.getFloat(25);
		             float Fore_462016 = rs.getFloat(26);
		             float sale_462016 = rs.getFloat(27);
		             float Fore_472016 = rs.getFloat(28);
		             float sale_472016 = rs.getFloat(29);
		             float Fore_482016 = rs.getFloat(30);
		             float sale_482016 = rs.getFloat(31);
		             float Fore_492016 = rs.getFloat(32);
		             float sale_492016 = rs.getFloat(33);
		             float Fore_502016 = rs.getFloat(34);
		             float sale_502016 = rs.getFloat(35);
		             float Fore_512016 = rs.getFloat(36);
		             float sale_512016 = rs.getFloat(37);
		             float Fore_522016 = rs.getFloat(38);
		             float sale_522016 = rs.getFloat(39);
		             float Fore_012017 = rs.getFloat(40);
		             float sale_012017 = rs.getFloat(41);
		             float Fore_022017 = rs.getFloat(42);
		             float sale_022017 = rs.getFloat(43);
		             float Fore_032017 = rs.getFloat(44);
		             float sale_032017 = rs.getFloat(45);
		             float Fore_042017 = rs.getFloat(46);
		             float sale_042017 = rs.getFloat(47);
		             float Fore_052017 = rs.getFloat(48);
		             float sale_052017 = rs.getFloat(49);
		             float Fore_062017 = rs.getFloat(50);
		             float sale_062017 = rs.getFloat(51);
		             float Fore_072017 = rs.getFloat(52);
		             float sale_072017 = rs.getFloat(53);
		             float Fore_082017 = rs.getFloat(54);
		             float sale_082017 = rs.getFloat(55);
		             float Fore_092017 = rs.getFloat(56);
		             float sale_092017 = rs.getFloat(57);
		             float Fore_102017 = rs.getFloat(58);
		             float sale_102017 = rs.getFloat(59);
		             float Fore_112017 = rs.getFloat(60);
		             float sale_112017 = rs.getFloat(61);
		             float Fore_122017 = rs.getFloat(62);
		             float sale_122017 = rs.getFloat(63);
		             float Fore_132017 = rs.getFloat(64);
		             float sale_132017 = rs.getFloat(65);
		             float Fore_142017 = rs.getFloat(66);
		             float sale_142017 = rs.getFloat(67);
		             float Fore_152017 = rs.getFloat(68);
		             float sale_152017 = rs.getFloat(69);
		             float Fore_162017 = rs.getFloat(70);
		             float sale_162017 = rs.getFloat(71);
		             float Fore_172017 = rs.getFloat(72);
		             float sale_172017 = rs.getFloat(73);
		             float Fore_182017 = rs.getFloat(74);
		             float sale_182017 = rs.getFloat(75);
		             
		             /*for(int j=3;j<=numberOfColumns;j++)
		             {
		            	 Math.abs(arrayList(j)-arrayList(++j));
		             }*/
		             
		             float bias_352016 = Math.abs(Fore_352016-sale_352016);
		             float bias_362016 = Math.abs(Fore_362016-sale_362016);
		             float bias_372016 = Math.abs(Fore_372016-sale_372016);
		             float bias_382016 = Math.abs(Fore_382016-sale_382016);
		             float bias_392016 = Math.abs(Fore_392016-sale_392016);
		             float bias_402016 = Math.abs(Fore_402016-sale_402016);
		             float bias_412016 = Math.abs(Fore_412016-sale_412016);
		             float bias_422016 = Math.abs(Fore_422016-sale_422016);
		             float bias_432016 = Math.abs(Fore_432016-sale_432016);
		             float bias_442016 = Math.abs(Fore_442016-sale_442016);
		             float bias_452016 = Math.abs(Fore_452016-sale_452016);
		             float bias_462016 = Math.abs(Fore_462016-sale_462016);
		             float bias_472016 = Math.abs(Fore_472016-sale_472016);
		             float bias_482016 = Math.abs(Fore_482016-sale_482016);
		             float bias_492016 = Math.abs(Fore_492016-sale_492016);
		             float bias_502016 = Math.abs(Fore_502016-sale_502016);
		             float bias_512016 = Math.abs(Fore_512016-sale_512016);
		             float bias_522016 = Math.abs(Fore_522016-sale_522016);
		             float bias_012017 = Math.abs(Fore_012017-sale_012017);
		             float bias_022017 = Math.abs(Fore_022017-sale_022017);
		             float bias_032017 = Math.abs(Fore_032017-sale_032017);
		             float bias_042017 = Math.abs(Fore_042017-sale_042017);
		             float bias_052017 = Math.abs(Fore_052017-sale_052017);
		             float bias_062017 = Math.abs(Fore_062017-sale_062017);
		             float bias_072017 = Math.abs(Fore_072017-sale_072017);
		             float bias_082017 = Math.abs(Fore_082017-sale_082017);
		             float bias_092017 = Math.abs(Fore_092017-sale_092017);
		             float bias_102017 = Math.abs(Fore_102017-sale_102017);
		             float bias_112017 = Math.abs(Fore_112017-sale_112017);
		             float bias_122017 = Math.abs(Fore_122017-sale_122017);
		             float bias_132017 = Math.abs(Fore_132017-sale_132017);
		             float bias_142017 = Math.abs(Fore_142017-sale_142017);
		             float bias_152017 = Math.abs(Fore_152017-sale_152017);
		             float bias_162017 = Math.abs(Fore_162017-sale_162017);
		             float bias_172017 = Math.abs(Fore_172017-sale_172017);
		             float bias_182017 = Math.abs(Fore_182017-sale_182017);
		             
		             int biasPerc_352016 = Math.round(bias_352016/Fore_352016);
		             int biasPerc_362016 = Math.round(bias_362016/Fore_362016);
		             int biasPerc_372016 = Math.round(bias_372016/Fore_372016);
		             int biasPerc_382016 = Math.round(bias_382016/Fore_382016);
		             int biasPerc_392016 = Math.round(bias_392016/Fore_392016);
		             int biasPerc_402016 = Math.round(bias_402016/Fore_402016);
		             int biasPerc_412016 = Math.round(bias_412016/Fore_412016);
		             int biasPerc_422016 = Math.round(bias_422016/Fore_422016);
		             int biasPerc_432016 = Math.round(bias_432016/Fore_432016);
		             int biasPerc_442016 = Math.round(bias_442016/Fore_442016);
		             int biasPerc_452016 = Math.round(bias_452016/Fore_452016);
		             int biasPerc_462016 = Math.round(bias_462016/Fore_462016);
		             int biasPerc_472016 = Math.round(bias_472016/Fore_472016);
		             int biasPerc_482016 = Math.round(bias_482016/Fore_482016);
		             int biasPerc_492016 = Math.round(bias_492016/Fore_492016);
		             int biasPerc_502016 = Math.round(bias_502016/Fore_502016);
		             int biasPerc_512016 = Math.round(bias_512016/Fore_512016);
		             int biasPerc_522016 = Math.round(bias_522016/Fore_522016);
		             int biasPerc_012017 = Math.round(bias_012017/Fore_012017);
		             int biasPerc_022017 = Math.round(bias_022017/Fore_022017);
		             int biasPerc_032017 = Math.round(bias_032017/Fore_032017);
		             int biasPerc_042017 = Math.round(bias_042017/Fore_042017);
		             int biasPerc_052017 = Math.round(bias_052017/Fore_052017);
		             int biasPerc_062017 = Math.round(bias_062017/Fore_062017);
		             int biasPerc_072017 = Math.round(bias_072017/Fore_072017);
		             int biasPerc_082017 = Math.round(bias_082017/Fore_082017);
		             int biasPerc_092017 = Math.round(bias_092017/Fore_092017);
		             int biasPerc_102017 = Math.round(bias_102017/Fore_102017);
		             int biasPerc_112017 = Math.round(bias_112017/Fore_112017);
		             int biasPerc_122017 = Math.round(bias_122017/Fore_122017);
		             int biasPerc_132017 = Math.round(bias_132017/Fore_132017);
		             int biasPerc_142017 = Math.round(bias_142017/Fore_142017);
		             int biasPerc_152017 = Math.round(bias_152017/Fore_152017);
		             int biasPerc_162017 = Math.round(bias_162017/Fore_162017);
		             int biasPerc_172017 = Math.round(bias_172017/Fore_172017);
		             int biasPerc_182017 = Math.round(bias_182017/Fore_182017);
		             
		             float biasPersale_352016 = biasPerc_352016 * sale_352016;
		             float biasPersale_362016 = biasPerc_362016 * sale_362016;
		             float biasPersale_372016 = biasPerc_372016 * sale_372016;
		             float biasPersale_382016 = biasPerc_382016 * sale_382016;
		             float biasPersale_392016 = biasPerc_392016 * sale_392016;
		             float biasPersale_402016 = biasPerc_402016 * sale_402016;
		             float biasPersale_412016 = biasPerc_412016 * sale_412016;
		             float biasPersale_422016 = biasPerc_422016 * sale_422016;
		             float biasPersale_432016 = biasPerc_432016 * sale_432016;
		             float biasPersale_442016 = biasPerc_442016 * sale_442016;
		             float biasPersale_452016 = biasPerc_452016 * sale_452016;
		             float biasPersale_462016 = biasPerc_462016 * sale_462016;
		             float biasPersale_472016 = biasPerc_472016 * sale_472016;
		             float biasPersale_482016 = biasPerc_482016 * sale_482016;
		             float biasPersale_492016 = biasPerc_492016 * sale_492016;
		             float biasPersale_502016 = biasPerc_502016 * sale_502016;
		             float biasPersale_512016 = biasPerc_512016 * sale_512016;
		             float biasPersale_522016 = biasPerc_522016 * sale_522016;
		             float biasPersale_012017 = biasPerc_012017 * sale_012017;
		             float biasPersale_022017 = biasPerc_022017 * sale_022017;
		             float biasPersale_032017 = biasPerc_032017 * sale_032017;
		             float biasPersale_042017 = biasPerc_042017 * sale_042017;
		             float biasPersale_052017 = biasPerc_052017 * sale_052017;
		             float biasPersale_062017 = biasPerc_062017 * sale_062017;
		             float biasPersale_072017 = biasPerc_072017 * sale_072017;
		             float biasPersale_082017 = biasPerc_082017 * sale_082017;
		             float biasPersale_092017 = biasPerc_092017 * sale_092017;
		             float biasPersale_102017 = biasPerc_102017 * sale_102017;
		             float biasPersale_112017 = biasPerc_112017 * sale_112017;
		             float biasPersale_122017 = biasPerc_122017 * sale_122017;
		             float biasPersale_132017 = biasPerc_132017 * sale_132017;
		             float biasPersale_142017 = biasPerc_142017 * sale_142017;
		             float biasPersale_152017 = biasPerc_152017 * sale_152017;
		             float biasPersale_162017 = biasPerc_162017 * sale_162017;
		             float biasPersale_172017 = biasPerc_172017 * sale_172017;
		             float biasPersale_182017 = biasPerc_182017 * sale_182017;
		             
		             float totalForecast = Fore_352016+Fore_362016+Fore_372016+Fore_382016+Fore_392016+Fore_402016+Fore_412016+Fore_422016+Fore_432016+Fore_442016+Fore_452016+Fore_462016+Fore_472016+Fore_482016+Fore_492016+Fore_502016+Fore_512016+Fore_522016+Fore_012017+Fore_022017+Fore_032017+Fore_042017+Fore_052017+Fore_062017+Fore_072017+Fore_082017+Fore_092017+Fore_102017+Fore_112017+Fore_122017+Fore_132017+Fore_142017+Fore_152017+Fore_162017+Fore_172017+Fore_172017;
		             float totalSales = sale_352016+sale_362016+sale_372016+sale_382016+sale_392016+sale_402016+sale_412016+sale_422016+sale_432016+sale_442016+sale_452016+sale_462016+sale_472016+sale_482016+sale_492016+sale_502016+sale_512016+sale_522016+sale_012017+sale_022017+sale_032017+sale_042017+sale_052017+sale_062017+sale_072017+sale_082017+sale_092017+sale_102017+sale_112017+sale_122017+sale_132017+sale_142017+sale_152017+sale_162017+sale_172017+sale_182017;
		             
		             int mape=Math.round((biasPersale_352016+biasPersale_362016+biasPersale_372016+biasPersale_382016+biasPersale_392016+biasPersale_402016+biasPersale_412016+biasPersale_422016+biasPersale_432016+biasPersale_442016+biasPersale_452016+biasPersale_462016+biasPersale_472016+biasPersale_482016+biasPersale_492016+biasPersale_502016+biasPersale_512016+biasPersale_522016+biasPersale_012017+biasPersale_022017+biasPersale_032017+biasPersale_042017+biasPersale_052017+biasPersale_062017+biasPersale_072017+biasPersale_082017+biasPersale_092017+biasPersale_102017+biasPersale_112017+biasPersale_122017+biasPersale_132017+biasPersale_142017+biasPersale_152017+biasPersale_162017+biasPersale_172017+biasPersale_182017)/totalSales);
		         
		             double factor = Math.sqrt(10/7);
		             
		             float avgForecast = totalForecast/36;
		             
		             float weeklyAvgForecast = avgForecast*(10/7);
		             
		             long sdfePerc = Math.round(mape*1.25*factor);
		             
		             double sdfe = avgForecast/sdfePerc;
		             
		             System.out.println("sdfePerc" +sdfePerc);
		             
		             String sql2 = "update BIAS_CALCULATION SET Bias_Calc_WEEK_352016=?, Bias_Perc_WEEK_352016=?, Bias_Per_Sale_WEEK_352016=?, Bias_Calc_WEEK_362016=?, Bias_Perc_WEEK_362016=?, Bias_Per_Sale_WEEK_362016=?, Bias_Calc_WEEK_372016=?, Bias_Perc_WEEK_372016=?, Bias_Per_Sale_WEEK_372016=?, Bias_Calc_WEEK_382016=?, Bias_Perc_WEEK_382016=?, Bias_Per_Sale_WEEK_382016=?, Bias_Calc_WEEK_392016=?, Bias_Perc_WEEK_392016=?, Bias_Per_Sale_WEEK_392016=?, Bias_Calc_WEEK_402016=?, Bias_Perc_WEEK_402016=?, Bias_Per_Sale_WEEK_402016=?, Bias_Calc_WEEK_412016=?, Bias_Perc_WEEK_412016=?, Bias_Per_Sale_WEEK_412016=?, Bias_Calc_WEEK_422016=?, Bias_Perc_WEEK_422016=?, Bias_Per_Sale_WEEK_422016=?,Bias_Calc_WEEK_432016=?, Bias_Perc_WEEK_432016=?, Bias_Per_Sale_WEEK_432016=?, Bias_Calc_WEEK_442016=?, Bias_Perc_WEEK_442016=?, Bias_Per_Sale_WEEK_442016=?, Bias_Calc_WEEK_452016=?, Bias_Perc_WEEK_452016=?, Bias_Per_Sale_WEEK_452016=?,Bias_Calc_WEEK_462016=?, Bias_Perc_WEEK_462016=?, Bias_Per_Sale_WEEK_462016=?,Bias_Calc_WEEK_472016=?, Bias_Perc_WEEK_472016=?, Bias_Per_Sale_WEEK_472016=?,Bias_Calc_WEEK_482016=?, Bias_Perc_WEEK_482016=?, Bias_Per_Sale_WEEK_482016=?,Bias_Calc_WEEK_492016=?, Bias_Perc_WEEK_492016=?, Bias_Per_Sale_WEEK_492016=?,Bias_Calc_WEEK_502016=?, Bias_Perc_WEEK_502016=?, Bias_Per_Sale_WEEK_502016=?,Bias_Calc_WEEK_512016=?, Bias_Perc_WEEK_512016=?, Bias_Per_Sale_WEEK_512016=?,Bias_Calc_WEEK_522016=?, Bias_Perc_WEEK_522016=?, Bias_Per_Sale_WEEK_522016=?,Bias_Calc_WEEK_012017=?, Bias_Perc_WEEK_012017=?, Bias_Per_Sale_WEEK_012017=?,Bias_Calc_WEEK_022017=?, Bias_Perc_WEEK_022017=?, Bias_Per_Sale_WEEK_022017=?,Bias_Calc_WEEK_032017=?, Bias_Perc_WEEK_032017=?, Bias_Per_Sale_WEEK_032017=?,Bias_Calc_WEEK_042017=?, Bias_Perc_WEEK_042017=?, Bias_Per_Sale_WEEK_042017=?,Bias_Calc_WEEK_052017=?, Bias_Perc_WEEK_052017=?, Bias_Per_Sale_WEEK_052017=?,Bias_Calc_WEEK_062017=?, Bias_Perc_WEEK_062017=?, Bias_Per_Sale_WEEK_062017=?,Bias_Calc_WEEK_072017=?, Bias_Perc_WEEK_072017=?, Bias_Per_Sale_WEEK_072017=?,Bias_Calc_WEEK_082017=?, Bias_Perc_WEEK_082017=?, Bias_Per_Sale_WEEK_082017=?,Bias_Calc_WEEK_092017=?, Bias_Perc_WEEK_092017=?, Bias_Per_Sale_WEEK_092017=?,Bias_Calc_WEEK_102017=?, Bias_Perc_WEEK_102017=?, Bias_Per_Sale_WEEK_102017=?,Bias_Calc_WEEK_112017=?, Bias_Perc_WEEK_112017=?, Bias_Per_Sale_WEEK_112017=?,Bias_Calc_WEEK_122017=?, Bias_Perc_WEEK_122017=?, Bias_Per_Sale_WEEK_122017=?,Bias_Calc_WEEK_132017=?, Bias_Perc_WEEK_132017=?, Bias_Per_Sale_WEEK_132017=?,Bias_Calc_WEEK_142017=?, Bias_Perc_WEEK_142017=?, Bias_Per_Sale_WEEK_142017=?,Bias_Calc_WEEK_152017=?, Bias_Perc_WEEK_152017=?, Bias_Per_Sale_WEEK_152017=?,Bias_Calc_WEEK_162017=?, Bias_Perc_WEEK_162017=?, Bias_Per_Sale_WEEK_162017=?,Bias_Calc_WEEK_172017=?, Bias_Perc_WEEK_172017=?, Bias_Per_Sale_WEEK_172017=?,Bias_Calc_WEEK_182017=?, Bias_Perc_WEEK_182017=?, Bias_Per_Sale_WEEK_182017=?,Weighted_Mape=?, SDFE=?, SDFE_Perc=?, Total_Past_Forecast=?, Total_Past_sales=?, Factor=?, Avg_Forecast=?, Count=?, Weekly_Avg_Forecast=? where SKU_NO='"+skuNo+"'";
		             
		             pstmt1=conn.prepareStatement(sql2);
		             
		             pstmt1.setFloat(1, bias_352016);
		             pstmt1.setFloat(2, biasPerc_352016);
		             pstmt1.setFloat(3, biasPersale_352016);
		             pstmt1.setFloat(4, bias_362016);
		             pstmt1.setFloat(5, biasPerc_362016);
		             pstmt1.setFloat(6, biasPersale_362016);
		             pstmt1.setFloat(7, bias_372016);
		             pstmt1.setFloat(8, biasPerc_372016);
		             pstmt1.setFloat(9, biasPersale_372016);
		             pstmt1.setFloat(10, bias_382016);
		             pstmt1.setFloat(11, biasPerc_382016);
		             pstmt1.setFloat(12, biasPersale_382016);
		             pstmt1.setFloat(13, bias_392016);
		             pstmt1.setFloat(14, biasPerc_392016);
		             pstmt1.setFloat(15, biasPersale_392016);
		             pstmt1.setFloat(16, bias_402016);
		             pstmt1.setFloat(17, biasPerc_402016);
		             pstmt1.setFloat(18, biasPersale_402016);
		             pstmt1.setFloat(19, bias_412016);
		             pstmt1.setFloat(20, biasPerc_412016);
		             pstmt1.setFloat(21, biasPersale_412016);
		             pstmt1.setFloat(22, bias_422016);
		             pstmt1.setFloat(23, biasPerc_422016);
		             pstmt1.setFloat(24, biasPersale_422016);
		             pstmt1.setFloat(25, bias_432016);
		             pstmt1.setFloat(26, biasPerc_432016);
		             pstmt1.setFloat(27, biasPersale_432016);
		             pstmt1.setFloat(28, bias_442016);
		             pstmt1.setFloat(29, biasPerc_442016);
		             pstmt1.setFloat(30, biasPersale_442016);
		             pstmt1.setFloat(31, bias_452016);
		             pstmt1.setFloat(32, biasPerc_452016);
		             pstmt1.setFloat(33, biasPersale_452016);
		             pstmt1.setFloat(34, bias_462016);
		             pstmt1.setFloat(35, biasPerc_462016);
		             pstmt1.setFloat(36, biasPersale_462016);
		             pstmt1.setFloat(37, bias_472016);
		             pstmt1.setFloat(38, biasPerc_472016);
		             pstmt1.setFloat(39, biasPersale_472016);
		             pstmt1.setFloat(40, bias_482016);
		             pstmt1.setFloat(41, biasPerc_482016);
		             pstmt1.setFloat(42, biasPersale_482016);
		             pstmt1.setFloat(43, bias_492016);
		             pstmt1.setFloat(44, biasPerc_492016);
		             pstmt1.setFloat(45, biasPersale_492016);
		             pstmt1.setFloat(46, bias_502016);
		             pstmt1.setFloat(47, biasPerc_502016);
		             pstmt1.setFloat(48, biasPersale_502016);
		             pstmt1.setFloat(49, bias_512016);
		             pstmt1.setFloat(50, biasPerc_512016);
		             pstmt1.setFloat(51, biasPersale_512016);
		             pstmt1.setFloat(52, bias_522016);
		             pstmt1.setFloat(53, biasPerc_522016);
		             pstmt1.setFloat(54, biasPersale_522016);
		             pstmt1.setFloat(55, bias_012017);
		             pstmt1.setFloat(56, biasPerc_012017);
		             pstmt1.setFloat(57, biasPersale_012017);
		             pstmt1.setFloat(58, bias_022017);
		             pstmt1.setFloat(59, biasPerc_022017);
		             pstmt1.setFloat(60, biasPersale_022017);
		             pstmt1.setFloat(61, bias_032017);
		             pstmt1.setFloat(62, biasPerc_032017);
		             pstmt1.setFloat(63, biasPersale_032017);
		             pstmt1.setFloat(64, bias_042017);
		             pstmt1.setFloat(65, biasPerc_042017);
		             pstmt1.setFloat(66, biasPersale_042017);
		             pstmt1.setFloat(67, bias_052017);
		             pstmt1.setFloat(68, biasPerc_052017);
		             pstmt1.setFloat(69, biasPersale_052017);
		             pstmt1.setFloat(70, bias_062017);
		             pstmt1.setFloat(71, biasPerc_062017);
		             pstmt1.setFloat(72, biasPersale_062017);
		             pstmt1.setFloat(73, bias_072017);
		             pstmt1.setFloat(74, biasPerc_072017);
		             pstmt1.setFloat(75, biasPersale_072017);
		             pstmt1.setFloat(76, bias_082017);
		             pstmt1.setFloat(77, biasPerc_082017);
		             pstmt1.setFloat(78, biasPersale_082017);
		             pstmt1.setFloat(79, bias_092017);
		             pstmt1.setFloat(80, biasPerc_092017);
		             pstmt1.setFloat(81, biasPersale_092017);
		             pstmt1.setFloat(82, bias_102017);
		             pstmt1.setFloat(83, biasPerc_102017);
		             pstmt1.setFloat(84, biasPersale_102017);
		             pstmt1.setFloat(85, bias_112017);
		             pstmt1.setFloat(86, biasPerc_112017);
		             pstmt1.setFloat(87, biasPersale_112017);
		             pstmt1.setFloat(88, bias_122017);
		             pstmt1.setFloat(89, biasPerc_122017);
		             pstmt1.setFloat(90, biasPersale_122017);
		             pstmt1.setFloat(91, bias_132017);
		             pstmt1.setFloat(92, biasPerc_132017);
		             pstmt1.setFloat(93, biasPersale_132017);
		             pstmt1.setFloat(94, bias_142017);
		             pstmt1.setFloat(95, biasPerc_142017);
		             pstmt1.setFloat(96, biasPersale_142017);
		             pstmt1.setFloat(97, bias_152017);
		             pstmt1.setFloat(98, biasPerc_152017);
		             pstmt1.setFloat(99, biasPersale_152017);
		             pstmt1.setFloat(100, bias_162017);
		             pstmt1.setFloat(101, biasPerc_162017);
		             pstmt1.setFloat(102, biasPersale_162017);
		             pstmt1.setFloat(103, bias_172017);
		             pstmt1.setFloat(104, biasPerc_172017);
		             pstmt1.setFloat(105, biasPersale_172017);
		             pstmt1.setFloat(106, bias_182017);
		             pstmt1.setFloat(107, biasPerc_182017);
		             pstmt1.setFloat(108, biasPersale_182017);
		             pstmt1.setInt(109, mape);
		             pstmt1.setDouble(110, sdfe);
		             pstmt1.setLong(111, sdfePerc);
		             pstmt1.setFloat(112, totalForecast);
		             pstmt1.setFloat(113, totalSales);
		             pstmt1.setDouble(114, factor);
		             pstmt1.setFloat(115, avgForecast);
		             pstmt1.setInt(116, 36);
		             pstmt1.setFloat(117, weeklyAvgForecast);
					 
					 pstmt1.executeUpdate();
					 
					 
					 /* IPM MODEL CALCULATIONS */
					 
					 System.out.println("IPM Calculations Started");
					 
					 String sql3="SELECT * FROM SELECTION";
					 st1 = conn.createStatement();
			         rs1 = st1.executeQuery(sql3);
			         int serviceLevel;
			         String targetServiceLevel="";
			         float minCapping = 0;
					 
			         if (rs1.next()) {
			        	 targetServiceLevel = rs1.getString("Target_ServiceLevel");
			        	 minCapping = rs1.getFloat("Min_Capping");		                       
			         }
			         String sql4="SELECT a.SKU,a.Location,a.Location_Type,a.Material_Location,a.Category,a.Service_Level,b.Weekly_Avg_Forecast,b.SDFE,b.SDFE_Perc,a.Production_Time,a.OR_Value,a.Source,a.SKU_Classification,a.Avg_Lead_Time,a.Lead_Time_Variability,a.Current_SSWeeks,a.Price,a.SKU_Name FROM Input_Parameter a, BIAS_CALCULATION b where a.Material_Location= b.SKU_NO and a.Material_Location='"+skuNo+"'";
					 st2 = conn.createStatement();
			         rs2 = st2.executeQuery(sql4);
			         
			         while(rs2.next())
			         {
			        	 System.out.println("Inside select block");
			        	 String SKU = rs2.getString(1);
			        	 String location1 = rs2.getString(2);
			        	 String locationType =rs2.getString(3);
			        	 String materialLocation = rs2.getString(4);
			        	 String category = rs2.getString(5);
			        	 if(targetServiceLevel.equals("Category service level"))
				         {
				        	 serviceLevel =rs1.getInt("Category_ServiceLevel"); 
				         }	
			        	 else
			        	 {
			        		 serviceLevel = rs2.getInt(6);
			        	 }		        	 
			        	 float avgWeeklyDemand = rs2.getFloat(7);
			        	 float sdfe1 = rs2.getFloat(8);
			        	 int sdfePerc1 = rs2.getInt(9);
			        	 float cycleTime = rs2.getFloat(10);
			        	 int orValue = rs2.getInt(11);
			        	 String source = rs2.getString(12);
			        	 String skuClassiication = rs2.getString(13);
			        	 float avgLeadTime = rs2.getFloat(14);
			        	 float leadTimeVariability = rs2.getFloat(15);
			        	 float currentSSWeeks = rs2.getFloat(16);
			        	 float price = rs2.getFloat(17);
			        	 String skuName = rs2.getString(18);
			       
				         float lotSize = cycleTime * avgWeeklyDemand;
				         double SdVariability = Math.sqrt(((Math.pow(sdfe, 2)) * (avgLeadTime)) + Math.pow(((avgWeeklyDemand) * (leadTimeVariability)),2) + Math.pow(avgWeeklyDemand,2) * Math.pow(1.25, 2) * Math.pow((cycleTime * (1-orValue)),2));
				         double cFactorSales = 0.92 + Math.log(avgWeeklyDemand * cycleTime * ((1-serviceLevel)/SdVariability));
				         double kFactorSales = -1.19 + Math.sqrt(((Math.pow(1.19, 2)) - 4*0.37*cFactorSales)/(2*0.37));
				         //double cycleServiceLevel = d.cumulativeProbability(kFactorSales);
				         double cycleServiceLevel =0;
				         double modelSafetyStock=0;
				         if(avgWeeklyDemand==0)
				         {
				        	 modelSafetyStock=0;
				         }
				         else if((kFactorSales * SdVariability)>0)
				         {
				        	 modelSafetyStock = kFactorSales * SdVariability;
				         }
				         double safetyStockWeeks;
				         if(modelSafetyStock==0)
				         {
				        	 safetyStockWeeks=0;
				         }
				         else if ((modelSafetyStock/avgWeeklyDemand)>13)
				         {
				        	 safetyStockWeeks =13;
				         }
				         else
				         {
				        	 safetyStockWeeks = (modelSafetyStock/avgWeeklyDemand);
				         }
				         long safetyStockDays = Math.round(safetyStockWeeks*7);
				         double minStockAfterCapping;
				         if(safetyStockWeeks < minCapping || safetyStockWeeks == 0)
				         {
				        	 minStockAfterCapping = minCapping;
				         }
				         else {
				        	 minStockAfterCapping = safetyStockWeeks;
				         }
				         double maxStockWeeks = minStockAfterCapping + cycleTime;
				         double minStockAfterCappingCs = avgWeeklyDemand * minStockAfterCapping;
				         double maxStockCs = avgWeeklyDemand * maxStockWeeks;
				         double currentSsValue = currentSSWeeks * avgWeeklyDemand * price;
				         double proposedIpmSsValue = price * minStockAfterCapping;
				         double minNormWeeks = minStockAfterCapping;
				         double maxNormWeeks = maxStockWeeks;
				         double minStock = minNormWeeks * price * avgWeeklyDemand;
				         double maxStock = maxNormWeeks * price * avgWeeklyDemand;
				         double avgCycleStock = (cycleTime/2) * price * avgWeeklyDemand;
				         
				         String sql5 = "insert into IPM_MODEL values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				         pstmt2=conn.prepareStatement(sql5);
				         pstmt2.setString(1,SKU);
				         pstmt2.setString(2,skuName);
				         pstmt2.setString(3,location1);
				         pstmt2.setString(4,locationType);
				         pstmt2.setString(5,materialLocation);
				         pstmt2.setString(6,skuClassiication);
				         pstmt2.setString(7,source);
				         pstmt2.setString(8,category);
				         pstmt2.setInt(9,serviceLevel);
				         pstmt2.setFloat(10,avgWeeklyDemand);
				         pstmt2.setInt(11,sdfePerc1);
				         pstmt2.setDouble(12,sdfe);
				         pstmt2.setDouble(13,lotSize);
				         pstmt2.setInt(14, orValue);
				         pstmt2.setFloat(15, cycleTime);
				         pstmt2.setFloat(16, avgLeadTime);
				         pstmt2.setFloat(17, leadTimeVariability);
				         pstmt2.setDouble(18, SdVariability);
				         pstmt2.setDouble(19, cFactorSales);
				         pstmt2.setDouble(20, kFactorSales);
				         pstmt2.setDouble(21, cycleServiceLevel);
				         pstmt2.setDouble(22, 0);
				         pstmt2.setInt(23, 0);
				         pstmt2.setInt(24, 0);
				         pstmt2.setInt(25, 0);
				         pstmt2.setDouble(26, modelSafetyStock);
				         pstmt2.setDouble(27, safetyStockWeeks);
				         pstmt2.setLong(28,safetyStockDays);
				         pstmt2.setDouble(29, minStockAfterCapping);
				         pstmt2.setDouble(30, maxStockWeeks);
				         pstmt2.setDouble(31, minStockAfterCappingCs);
				         pstmt2.setDouble(32, maxStockCs);
				         pstmt2.setFloat(33, currentSSWeeks);
				         pstmt2.setFloat(34, price);
				         pstmt2.setDouble(35, currentSsValue);
				         pstmt2.setDouble(36, proposedIpmSsValue);
				         pstmt2.setDouble(37, minNormWeeks);
				         pstmt2.setDouble(38, maxNormWeeks);
				         pstmt2.setDouble(39, minStock);
				         pstmt2.setDouble(40, maxStock);
				         pstmt2.setDouble(41, avgCycleStock);
				         
						 pstmt2.executeUpdate();
						 
						 System.out.println("Insertion Completed");
			         }
					 
		         }
	   		}
	   		catch (SQLException e) {
				e.printStackTrace();
		 }
	   		finally 
	   		{
	  			try 
	  			{
		  			conn.close();
		  			pstmt.close();
		  			pstmt1.close();  			
	  			}
	  			catch (SQLException e) {
	  				e.printStackTrace();
	  		 }
	  		}
	    
	   		}

}
