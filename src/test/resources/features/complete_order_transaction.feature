Feature: As a user I should correctly complete a buy of product

  Scenario Outline: Complete a buy correctly

    Given <User> enter email: <Email> and password: <Password> to sign in

    When <User> select: <NavBar> in navbar
    And <User> search product of <Color> blue-color with url img: <UrlImg>
    And <User> in a product page verify name of de product: <NameProduct> and color: <ColorValidate>
    And <User> complete step1 and validate price: <PriceP> in checkout
    And <User> validate Address: <Address> and add comment: <Comment> in step3
    And <User> validate shipping method, price: <PriceS> click en checkbox in step4
    And <User> select payment method by: <PaymentM> in step5

    Then <User> validate transaction in order details with date: <MessageOk>, <Amount>, <DetailsOrder>
    Examples:
      | User  | Email               | Password   | NavBar   | Color  | UrlImg               | NameProduct                 | ColorValidate | PriceP | Address         | Comment   | PriceS | PaymentM | MessageOk                           | Amount | DetailsOrder |
      | Luis  | juantor16@gmail.com | Argentina1 | Dresses  | Blue   | /1/2/12-home_default | Printed Summer Dress        | Blue          | $30.98 | calle falsa 669 | Thank you | $2.00  | bankwire | Your order on My Store is complete. | $30.98 | xyz          |
      | Pedro | juantor16@gmail.com | Argentina1 | Women    | Orange | /1/1-home_default    | Faded Short Sleeve T-shirts | Orange        | $18.51 | calle falsa 669 | Thank you | $2.00  | cheque   | YOUR CHECK MUST INCLUDE:            | $18.51 | xyz          |
      | Juan  | juantor16@gmail.com | Argentina1 | T-shirts | Blue   | /1/1-home_default    | Faded Short Sleeve T-shirts | Blue          | $18.51 | calle falsa 669 | Thank you | $2.00  | bankwire | Your order on My Store is complete. | $18.51 | xyz          |
