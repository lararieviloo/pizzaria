# Pizzaria

### Diagrama de Classe:

* NomeClasse: Pedido  
* Atributos:
  * id: Long
  * descricao: String
  * clienteId: Long  
* Métodos:
  * getId(): Long
  * setId(id: Long): void
  * getDescricao(): String
  * setDescricao(descricao: String): void
  * getClienteId(): Long
  * setClienteId(clienteId: Long): void
  * Pedido(clienteId: Long, descricao: String)  


* NomeClasse: Cliente  
* Atributos:
  * id: Long
  * nome: String
  * email: String  
* Métodos:
  * getId(): Long
  * setId(id: Long): void
  * getNome(): String
  * setNome(nome: String): void
  * getEmail(): String
  * setEmail(email: String): void
  * Cliente(nome: String, email: String)  


* NomeClasse: Pagamento  
* Atributos:
  * id: Long
  * valorPago: double
  * pedidoId: Long
  * dataHoraPagamento: Date
  * formaPagamento : Enum: FormaPagamento  
* Métodos:
  * validarPagamento(valorTotal: double): void
  * getId(): Long
  * setId(id: Long)
  * getvalorPago(): double
  * setvalorPago(valorPago: double)
  * getPedidoId(): Long
  * setPedidoId(pedidoID: Long)
  * getDataHoraPagamento(): Date
  * setDataHoraPagamento(dataHoraPagamento: Date)
  * getFormaPagamento (): Enum FormaPagamento
  * setFormaPagamento (FormaPagamento : Enum)  


* Enum FormaPagamento
  * DINHEIRO
  * PIX
  * DEBITO
  * CREDITO  

### Relacionamento de classe:

Cliente - - - > Pedido - - - > Pagamento <- - - Enum