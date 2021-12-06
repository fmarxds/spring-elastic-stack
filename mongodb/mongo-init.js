db.produtos.insertOne({
    'nome': 'Galaxy S21',
    'valor': 3500.00
});

db.produtos.insertOne({
    'nome': 'iPhone 12',
    'valor': 4500.00
});

db.createUser(
        {
            user: "admin",
            pwd: "admin",
            roles: [
                {
                    role: "readWrite",
                    db: "elastic-stack"
                }
            ]
        }
);