import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaDoJoao <T> extends ColecaoDoJoao<T> implements List<T> {

	@Override
	public int size() {
		
		return getQuantidade();
	}

	@Override
	public boolean isEmpty() {
		if(getQuantidade()>0) {
			return false;
		}
		return true;
	}

	
	@Override
	public boolean contains(Object o) {
		
		if(o == null) {
			return false;
		}
		else {
			
			Node<T> aux = super.getInicio();
			for(int i = 0; i < getQuantidade(); i++) {
				
				if(aux.equals(o)) {
					return true;
				}
				else {
					aux = aux.getNext();
				}
				
			}
			return false;
		}
			
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
				
			Object []o = new Object[getQuantidade()]; 
			
			Node<T> aux = super.getInicio();
			
			for(int i = 0; i < getQuantidade(); i++) {
				o[i] = aux.getData() ;
				aux = aux.getNext();
			}
			
			return o;
			
		
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;
	}

	@Override
	public boolean add(T e) {
		
		return inserirFim(e);
		
	
	}

	@Override
	public boolean remove(Object o) {
		
		if(o == null) {
			return false;
		}
		
		else {
		
			int indice = buscaIndexObject(o);
			
			if(indice == -1) {
				return false;
			}
			
			else {
				removeIndex(indice);
			}
			
			
		}
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		clear();
	}

	@Override
	public T get(int index) {
		
		T aux = buscaNo(index).getData();
		return aux;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}















