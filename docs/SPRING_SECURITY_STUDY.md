# Spring Security Study Guide

Technical notes and learning checkpoints for the development of the reusable Auth API template.

**_UserDetailsServiceImpl_**

Implementa o UserDetailsService

**_UserDetailsService_**

Contrato (o security separa cada responsabilidade em contratos) do spring security que define
onde e como o user deve ser encontrado - credenciais

O Spring Security não sabe:

* que teu login será por email
* que existe um UserRepository
* que tua tabela se chama users
* que tua entidade possui um campo role
* como transformar tua entidade em um usuário de segurança

Então o UserDetailsService serve para ensinar ao framework isso - `"Quando receber um email, consulte meu UserRepository,
busque no PostgreSQL e devolva os dados no formato UserDetails."`

