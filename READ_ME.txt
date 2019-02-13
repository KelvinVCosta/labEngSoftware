Instruções de execução do projeto:

  Este projeto utiliza MongoDB como banco de dados
  Baixar: https://www.mongodb.com/download-center/community
  Instale o MongoDB e suba o banco de dados

  Após a instalação do banco, abra o projeto e realize o clean and build
  Execute o projeto, sua saída deverá ser algo similar à:

  Customers find with findAll()
  -----------------------------
  Customer{id=5c644759b67f7c4fd8457b68, firstName=Kelvin, lastName=Costa, endereco=Address{cep=00000-000, endereco=Avenida Engenharia de Software, numero=2019, complemento=5o semestre}}
  Customer{id=5c644759b67f7c4fd8457b69, firstName=Judy, lastName=Costa, endereco=Address{cep=00000-000, endereco=Avenida Engenharia de Software, numero=2019, complemento=5o semestre}}

  Customer find with findByFirstName()
  ------------------------------------
  Customer{id=5c644759b67f7c4fd8457b68, firstName=Kelvin, lastName=Costa, endereco=Address{cep=03586-000, endereco=Avenida Lider, numero=1150, complemento=Ap 65 Bl 1}}
  Customer find with findByLastName()
  ------------------------------------
  [Customer{id=5c644759b67f7c4fd8457b68, firstName=Kelvin, lastName=Costa, endereco=Address{cep=03586-000, endereco=Avenida Lider, numero=1150, complemento=Ap 65 Bl 1}}, Customer{id=5c644759b67f7c4fd8457b69, firstName=Judy, lastName=Costa, endereco=Address{cep=03586-000, endereco=Avenida Lider, numero=1150, complemento=Ap 65 Bl 1}}]
