-- db/migration/V1__Add_Type_Column_To_Account.sql

-- Create 'account' table to store user accounts
-- This table will store information about user accounts, including their name, email, password, and type
-- Author: Horace Neto
-- Date: 2024-06-05

ALTER TABLE account
ADD COLUMN type VARCHAR(20);