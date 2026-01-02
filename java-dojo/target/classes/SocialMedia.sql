DROP TABLE IF EXISTS message;
DROP TABLE IF EXISTS account;

CREATE TABLE account {
    account_id SERIAL PRIMARY KEY, 
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL, 
    last_login TIMESTAMP,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
    CHECK (LENGTH(username) >= 3) AND (LENGTH(username) <= 255), 
    CHECK (LENGTH(password) >= 8)
};

CREATE TABLE message {
    message_id SERIAL PRIMARY KEY, 
    posted_by int NOT NULL, 
    message_text VARCHAR(255) NOT NULL, 
    time_posted_epoch BIGINT NOT NULL, 
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
    FOREIGN KEY (posted_by) REFERENCES account(account_id)
};

INSERT INTO account (username, password) 
VALUES ('user1', 'securePassword123'), 
       ('user2', 'anotherSecurePass');

INSERT INTO message (posted_by, message_text, time_posted_epoch) 
VALUES (1, 'Hello, this is my first post!', EXTRACT(EPOCH FROM NOW())),
       (2, 'Loving this social media app!', EXTRACT(EPOCH FROM NOW()));
