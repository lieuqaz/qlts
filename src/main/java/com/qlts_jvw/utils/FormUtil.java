package com.qlts_jvw.utils;


import java.lang.reflect.InvocationTargetException;
//import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.http.HttpServletRequest;
public class FormUtil {
	@SuppressWarnings("unchecked")
	public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
		T object = null;
		try {
			object = clazz.newInstance();
			
//			BeanUtils.populate(object, request.getParameterMap());
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			System.out.print(e.getMessage());
		}
		return object;
	}
}
