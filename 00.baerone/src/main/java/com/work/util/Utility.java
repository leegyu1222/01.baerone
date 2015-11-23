package com.work.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * <pre>
 *  �������� ����ϱ� ���� ��ƿ Ŭ���� - Utility
 *  
 * 	getCurrentDate() : �⺻ 4�ڸ� ���������� ���ڿ��� ��ȯ�ϴ� �޼���
 *	getSecureCode(length) : ���޹��� ������ ������ ���ȹ��� ��ȯ
 *	getCurrentDate() : ���� ��¥�� �Է¹��� pattern �������� ��ȯ 
 *	getCurrentDate(pattern) : ���� ��¥�� �Է¹��� pattern �������� ��ȯ
 *  getCurrentHour() : ���� �ð��� �ð��� ��ȯ
 *
 * @since 2015-11-02
 * @author �̵���
 * @version 1.0
 * </pre>
 * 
 */

public class Utility {
   
   /**
    * �⺻ 4�ڸ� ���������� ���ڿ��� ��ȯ�ϴ� �޼���
    * @see java.lang.Math#random()
    * @see java.util.Random#nextInt()
    * @see java.lang.System.currentTimeMillis()
    * @see java.lang.StringBuilder
    * 
    * @return String : 4�ڸ� ���������� ���ڿ�
    */
   public static String getSecureCode() {
      return getSecureCode(4);
   }
   
   /** 
    * ���޹��� ������ ������ ���ȹ��� ��ȯ
    * @param length
    * @return String : ���޹��� length ������ ������ ���ȹ���
    */
   public static String getSecureCode(int length) {
      Random random = new Random((long)(System.currentTimeMillis()*Math.random()));
      StringBuilder code = new StringBuilder();
      for(int i = 0; i < 4; i++){
         code.append(random.nextInt(10));
      }
      return code.toString();
   }
   
   /**
    * ���� ��¥�� �⵵4�ڸ�/��2�ڸ�/��2�ڸ� �������� ��ȯ
    * @see java.util.Date
    * @see java.text.SimpleDateFormat#format(java.util.Date)
    * @return String : yyyy/MM/dd ������ ���� ��¥
    */
   public static String getCurrentDate() {
      return getCurrentDate("yyyy/MM/dd");
   }
   
   /**
    * ���� ��¥�� �Է¹��� pattern �������� ��ȯ
    * @param pattern
    * @return String : �Է¹��� pattern ������ ���� ��¥
    */
   public static String getCurrentDate(String pattern) {
      Date date = new Date();
      SimpleDateFormat sdf  = new SimpleDateFormat(pattern);
      return sdf.format(date);
   }
   
	
	/**
	 * ���� �ð��� �ð��� ��ȯ
	 * @return : int : ���� �ð��� �ð�
	 */
	public static int getCurrentHour(){
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("H");
		
		return Integer.parseInt(dayTime.format(new Date(time)));
	}
}