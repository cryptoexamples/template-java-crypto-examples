# template-java-crypto-examples for [CryptoExamples.com](http://cryptoexamples.com)

Template project for [CryptoExamples](https://github.com/kmindi/crypto-examples)

## Usage

- [ ] Implementation with Tests (see src/)
- [ ] Documentation in Markdown-Files (see \*.md)
- [ ] Create Issue in [CryptoExamples](https://github.com/kmindi/crypto-examples) repo

## Review Process

When a code example was changed, the the rule is, that not only the changes should be reviewed, but the whole example must be reviewed. The semantic of a signed commit is, that all changed examples in the corresponding branch have been reviewed by the expert. To sign and finish the review all experts who reviewed the pull request must do the following:

1. Locally checkout and pull the branch
1. Create an empty and signed commit
1. Push your commit to GitHub

`git commit --allow-empty --gpg-sign=12345678 # replace "12345678" by your GnuPG fingerprint`

Once all reviewers have completed these steps merge the branch into master.

## License

[The Unlicense](LICENSE).
