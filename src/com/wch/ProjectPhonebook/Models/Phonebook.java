package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Phonebook  implements Comparator<Contact>, Iterable<Contact> {
	
	private DataBase dataBase;
	public Phonebook() {
	}
	
	public Phonebook(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	
	/**
	 * Compares its two arguments for order.  Returns a negative integer,
	 * zero, or a positive integer as the first argument is less than, equal
	 * to, or greater than the second.<p>
	 * <p>
	 * The implementor must ensure that {@link Integer#signum
	 * signum}{@code (compare(x, y)) == -signum(compare(y, x))} for
	 * all {@code x} and {@code y}.  (This implies that {@code
	 * compare(x, y)} must throw an exception if and only if {@code
	 * compare(y, x)} throws an exception.)<p>
	 * <p>
	 * The implementor must also ensure that the relation is transitive:
	 * {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
	 * {@code compare(x, z)>0}.<p>
	 * <p>
	 * Finally, the implementor must ensure that {@code compare(x,
	 * y)==0} implies that {@code signum(compare(x,
	 * z))==signum(compare(y, z))} for all {@code z}.
	 *
	 * @param o1 the first object to be compared.
	 * @param o2 the second object to be compared.
	 * @return a negative integer, zero, or a positive integer as the
	 * first argument is less than, equal to, or greater than the
	 * second.
	 * @throws NullPointerException if an argument is null and this
	 *                              comparator does not permit null arguments
	 * @throws ClassCastException   if the arguments' types prevent them from
	 *                              being compared by this comparator.
	 * @apiNote It is generally the case, but <i>not</i> strictly required that
	 * {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
	 * any comparator that violates this condition should clearly indicate
	 * this fact.  The recommended language is "Note: this comparator
	 * imposes orderings that are inconsistent with equals."
	 */
	@Override
	public int compare(Contact o1, Contact o2) {
		return 0;
	}
	
	/**
	 * Returns an iterator over elements of type {@code T}.
	 *
	 * @return an Iterator.
	 */
	@Override
	public Iterator<Contact> iterator() {
		return null;
	}
	
	/**
	 * Performs the given action for each element of the {@code Iterable}
	 * until all elements have been processed or the action throws an
	 * exception.  Actions are performed in the order of iteration, if that
	 * order is specified.  Exceptions thrown by the action are relayed to the
	 * caller.
	 * <p>
	 * The behavior of this method is unspecified if the action performs
	 * side-effects that modify the underlying source of elements, unless an
	 * overriding class has specified a concurrent modification policy.
	 *
	 * @param action The action to be performed for each element
	 * @throws NullPointerException if the specified action is null
	 * @implSpec <p>The default implementation behaves as if:
	 * <pre>{@code
	 *     for (T t : this)
	 *         action.accept(t);
	 * }</pre>
	 * @since 1.8
	 */
	@Override
	public void forEach(Consumer<? super Contact> action) {
		Iterable.super.forEach(action);
	}
	
	public DataBase getDataBase() {
		return dataBase;
	}
	
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
}
