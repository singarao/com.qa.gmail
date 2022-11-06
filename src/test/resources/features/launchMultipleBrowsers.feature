Feature: Launch multiple browsers using examples keyword
  Scenario Outline: Launch multiple browsers using examples keyword
    Given launch <bn> browser
    Then enter the url
  	Then close Browser
  	
    Examples: 
      | bn  |
      | chrome |
      | edge |
  #   | firefox |