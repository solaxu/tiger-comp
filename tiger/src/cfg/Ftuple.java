/*------------------------------------------------------------------*/
/* Copyright (C) SSE-USTC, 2014-2015                                */
/*                                                                  */
/*  FILE NAME             :  Ftuple.java                            */
/*  PRINCIPAL AUTHOR      :  qcLiu                                  */
/*  LANGUAGE              :  Java                                   */
/*  TARGET ENVIRONMENT    :  ANY                                    */
/*  DATE OF FIRST RELEASE :  2014/10/05                             */
/*  DESCRIPTION           :  the tiger compiler                     */
/*------------------------------------------------------------------*/

/*
 * Revision log:
 *
 * 
 *
 */
package cfg;

import java.util.LinkedList;

import cfg.Cfg.Dec;
import cfg.Cfg.Type;

public class Ftuple
{
	public String classs; // name of the class
	public Type.T ret; // type of the field
	public LinkedList<Dec.T> args; // type of args
	public String id; // name of the field or method

	public Ftuple(String classs, Type.T ret, java.util.LinkedList<Dec.T> args,
			String id)
	{
		this.classs = classs;
		this.ret = ret;
		this.args = args;
		this.id = id;
	}

	@Override
	// This is a specialized version of "equals", for
	// it compares whether the second field is equal,
	// but ignores the first field.
	public boolean equals(Object t)
	{
		if (t == null)
			return false;

		if (!(t instanceof Ftuple))
			return false;

		return this.id.equals(((Ftuple) t).id);
	}

}
