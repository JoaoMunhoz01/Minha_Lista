public class ColecaoDoJoao<T> {

	private Node<T> inicio;
	private int quantidade;
	private Node<T> tail;

	public ColecaoDoJoao() {
		this.quantidade = 0;
		this.inicio = null;
		this.tail = null;
	}

	public Node<T> getInicio() {
		return inicio;
	}

	public void setInicio(Node<T> inicio) {
		this.inicio = inicio;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Node<T> getTail() {
		return this.tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public boolean inserirInicio(T element) {

		Node<T> nozinho = new Node<T>(element);

		if (this.quantidade == 0) {
			this.inicio = nozinho;
			this.tail = nozinho;
			this.quantidade = this.quantidade + 1;
			return true;
		} else {
			nozinho.setNext(this.inicio);
			this.inicio = nozinho;
			this.quantidade = this.quantidade + 1;
			return true;
		}

	}

	public Node<T> buscaNo(T element) {

		Node<T> nozinho = inicio;
		while (nozinho != null) {
			if (nozinho.getData().equals(element)) {

				return nozinho;
			}
			nozinho = nozinho.getNext();
		}
		return null;
	}
	
	public int buscaIndex(T element) {

		Node<T> nozinho = inicio;
		int contador = 0;
		while (nozinho != null) {
			if (nozinho.getData().equals(element)) {

				return contador;
			}
			nozinho = nozinho.getNext();
			contador++;
		}
		return -1;
	} 
	
	public int buscaIndexObject(Object element) {

		Node<T> nozinho = inicio;
		int contador = 0;
		while (nozinho != null) {
			if (nozinho.getData().equals(element)) {

				return contador;
			}
			nozinho = nozinho.getNext();
			contador++;
		}
		return -1;
	}

	public Node<T> buscaNo(int index) {

		Node<T> nozinho = inicio;
		if (index > quantidade) {
			return null;
		} else {
			for (int i = 0; i <= index; i++) {
				if (i == index) {

					return nozinho;
				}
				nozinho = nozinho.getNext();
			}
			return null;

		}
	}
	
	public boolean buscaElemento(T element) {

		Node<T> nozinho = inicio;
		while (nozinho != null) {
			if (nozinho.getData().equals(element)) {

				return true;
			}
			nozinho = nozinho.getNext();
		}
		return false;
	}

	public Node<T> buscaElemento(int index) {

		Node<T> nozinho = inicio;
		if (index > quantidade) {
			return null;
		} else {
			for (int i = 0; i <= index; i++) {
				if (i == index) {

					return nozinho;
				}
				nozinho = nozinho.getNext();
			}
			return null;

		}
	}

	public boolean removerInicio() {
		Node<T> nozinho = this.inicio.getNext();

		if (this.quantidade == 1) {
			this.inicio = null;
			this.tail = null;
			this.quantidade--;

			if (inicio == null) {
				return true;
			}
			return false;
			
		} else {
			
			this.inicio = inicio.getNext();
			if (nozinho.equals(inicio)) {
				quantidade = quantidade - 1;
				return true;

			}
			return false;
		}
	}

	public boolean inserirFim(T element) {

		if (inicio == null) {
			inserirInicio(element);

			if (inicio.equals(element)) {
				return true;
			}
			return false;
		} else {

			Node<T> nozinho = new Node<T>(element);
			this.tail.setNext(nozinho);
			this.tail = nozinho;
			if (this.tail.getNext() == null) {
				quantidade++;
				return true;
			}
			return false;
		}

	}
	public boolean removeIndex(int i) {
		Node<T> nozinho = this.inicio;

		if (this.quantidade <= 1) {
			this.inicio = null;
			this.tail = null;
			this.quantidade--;

			if (inicio == null) {
				return true;
			}
			return false;
			
		} else {
			int contador = 0;
			while(contador < i ) {
				nozinho = nozinho.getNext();
			}
			nozinho.setNext(nozinho.getNext().getNext());
			return true;
			
			
		}
	}
	public boolean removerFim() {
		Node<T> nozinho = this.inicio;

		if (this.quantidade <= 1) {
			this.inicio = null;
			this.tail = null;
			this.quantidade--;

			if (inicio == null) {
				return true;
			}
			return false;
			
		} else {
			while(nozinho.getNext()!=tail) {
				nozinho = nozinho.getNext();
			}
			nozinho.setNext(nozinho.getNext().getNext());
			return true;
			
			
		}
	}
	public void clear() {
		inicio = null;
		tail = null;
	}
	

	@Override
	public String toString() {
		return "ColecaoEncadeada [inicio=" + inicio + ", quantidade=" + quantidade + "]";
	}

}